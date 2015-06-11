package jp.lionas.android.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.lionas.android.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // データバインディング
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new User(getString(R.string.before_binding_first_name), getString(R.string.before_binding_last_name), getString(R.string.nick_name));
        binding.setUser(mUser);
        binding.inputAreaEditText.addTextChangedListener(this);

        ButterKnife.inject(this);
    }

    @OnClick(R.id.button)
    public void bindText() {

        // 違うデータで再バインド
        mUser.setFirstName(getString(R.string.after_binding_first_name));
        mUser.setLastName(getString(R.string.after_binding_last_name));
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        // EditTextが変更されたらバインドされた文字列を反映
        mUser.setNickName(s.toString());

    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}

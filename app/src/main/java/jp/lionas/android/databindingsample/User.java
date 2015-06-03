package jp.lionas.android.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    private String nickName;

    public User(String firstName, String lastName, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    @Bindable
    public String getNickName() {
        return this.nickName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        notifyPropertyChanged(BR.nickName);
    }

}
<?php
/**
 * Created by PhpStorm.
 * User: Zachary
 * Date: 6/13/2015
 * Time: 5:02 PM
 */

namespace LoginProject;


class Account {

    public $username;

    public $password;

    public function create($username, $password) {
        $account = new Account();

        $account->username = $username;

        $account->setPassword($password);

        $account->save();

        return $account;

    }

    public static function lookup($account) {

    }

    public function check() {
        $string = file_get_contents("C:/Users/Zachary/Desktop/LoginGIt/LoginProject/Credentials.json");
        $json = json_decode($string, true);
    }

    public function setPassword($password)  {
        $this->password = password_hash($password, PASSWORD_DEFAULT);
        return $this->password;
    }

    public function save() {

    }



}
package ss6;/*Welcome to my show !

@author: NgKhanh
Date: 4/11/2022
Time: 9:19 PM
ProjectName: JavaBasic1*/

import java.util.ArrayList;

public class UserClass {
    ArrayList myCart = new ArrayList();

    public void createList(){
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");
        System.out.println("Cart contents are:"+ myCart);
    }

    public static void main(String[] args) {
        UserClass objUser = new UserClass();
        objUser.createList();
        StaticMembers objStatic = new StaticMembers();
        objStatic.displayCount();
    }
}

package com.xworkz.networkapp;

import com.xworkz.networkapp.jio.JioNet;
import com.xworkz.networkapp.vi.ViNet;


public class NetworkRunner {

    public static void main(String[] args) {
        JioNet jio = new JioNet();
        jio.ID=1;
        jio.Name="jio";

        ViNet vi = new ViNet();
        vi.ID=2;
        vi.Name="VI";
        System.out.println(jio.ID);
        System.out.println(vi.ID);

    }
}

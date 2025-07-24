class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Weapon weapon1 = new Weapon();
        weapon1.weaponId = 1;
        weapon1.name = "Katana";
        weapon1.type = "Sword";
        weapon1.material = "Steel";
        weapon1.weight = 2.5;
        weapon1.isLicensed = true;
        System.out.println("Weapon 1: " + weapon1.weaponId + ", " + weapon1.name + ", " + weapon1.type + ", " + weapon1.material + ", " + weapon1.weight + "kg, Licensed: " + weapon1.isLicensed);

        Weapon weapon2 = new Weapon();
        weapon2.weaponId = 2;
        weapon2.name = "Glock";
        weapon2.type = "Pistol";
        weapon2.material = "Polymer";
        weapon2.weight = 1.1;
        weapon2.isLicensed = true;
        System.out.println("Weapon 2: " + weapon2.weaponId + ", " + weapon2.name + ", " + weapon2.type + ", " + weapon2.material + ", " + weapon2.weight + "kg, Licensed: " + weapon2.isLicensed);

        Weapon weapon3 = new Weapon();
        weapon3.weaponId = 3;
        weapon3.name = "AK-47";
        weapon3.type = "Rifle";
        weapon3.material = "Steel";
        weapon3.weight = 4.3;
        weapon3.isLicensed = false;
        System.out.println("Weapon 3: " + weapon3.weaponId + ", " + weapon3.name + ", " + weapon3.type + ", " + weapon3.material + ", " + weapon3.weight + "kg, Licensed: " + weapon3.isLicensed);

        Weapon weapon4 = new Weapon();
        weapon4.weaponId = 4;
        weapon4.name = "Spear";
        weapon4.type = "Polearm";
        weapon4.material = "Wood & Iron";
        weapon4.weight = 3.0;
        weapon4.isLicensed = false;
        System.out.println("Weapon 4: " + weapon4.weaponId + ", " + weapon4.name + ", " + weapon4.type + ", " + weapon4.material + ", " + weapon4.weight + "kg, Licensed: " + weapon4.isLicensed);

        Weapon weapon5 = new Weapon();
        weapon5.weaponId = 5;
        weapon5.name = "Crossbow";
        weapon5.type = "Ranged";
        weapon5.material = "Wood & Steel";
        weapon5.weight = 2.8;
        weapon5.isLicensed = true;
        System.out.println("Weapon 5: " + weapon5.weaponId + ", " + weapon5.name + ", " + weapon5.type + ", " + weapon5.material + ", " + weapon5.weight + "kg, Licensed: " + weapon5.isLicensed);

        Weapon weapon6 = new Weapon();
        weapon6.weaponId = 6;
        weapon6.name = "Dagger";
        weapon6.type = "Knife";
        weapon6.material = "Steel";
        weapon6.weight = 0.5;
        weapon6.isLicensed = false;
        System.out.println("Weapon 6: " + weapon6.weaponId + ", " + weapon6.name + ", " + weapon6.type + ", " + weapon6.material + ", " + weapon6.weight + "kg, Licensed: " + weapon6.isLicensed);

        Weapon weapon7 = new Weapon();
        weapon7.weaponId = 7;
        weapon7.name = "Machete";
        weapon7.type = "Blade";
        weapon7.material = "Carbon Steel";
        weapon7.weight = 1.2;
        weapon7.isLicensed = true;
        System.out.println("Weapon 7: " + weapon7.weaponId + ", " + weapon7.name + ", " + weapon7.type + ", " + weapon7.material + ", " + weapon7.weight + "kg, Licensed: " + weapon7.isLicensed);

        Weapon weapon8 = new Weapon();
        weapon8.weaponId = 8;
        weapon8.name = "Longbow";
        weapon8.type = "Bow";
        weapon8.material = "Yew Wood";
        weapon8.weight = 2.0;
        weapon8.isLicensed = false;
        System.out.println("Weapon 8: " + weapon8.weaponId + ", " + weapon8.name + ", " + weapon8.type + ", " + weapon8.material + ", " + weapon8.weight + "kg, Licensed: " + weapon8.isLicensed);

        Weapon weapon9 = new Weapon();
        weapon9.weaponId = 9;
        weapon9.name = "Flamethrower";
        weapon9.type = "Heavy";
        weapon9.material = "Alloy";
        weapon9.weight = 7.5;
        weapon9.isLicensed = true;
        System.out.println("Weapon 9: " + weapon9.weaponId + ", " + weapon9.name + ", " + weapon9.type + ", " + weapon9.material + ", " + weapon9.weight + "kg, Licensed: " + weapon9.isLicensed);

        Weapon weapon10 = new Weapon();
        weapon10.weaponId = 10;
        weapon10.name = "Nunchaku";
        weapon10.type = "Martial Art";
        weapon10.material = "Wood";
        weapon10.weight = 0.9;
        weapon10.isLicensed = false;
        System.out.println("Weapon 10: " + weapon10.weaponId + ", " + weapon10.name + ", " + weapon10.type + ", " + weapon10.material + ", " + weapon10.weight + "kg, Licensed: " + weapon10.isLicensed);

        Weapon weapon11 = new Weapon();
        weapon11.weaponId = 11;
        weapon11.name = "Mace";
        weapon11.type = "Blunt";
        weapon11.material = "Iron";
        weapon11.weight = 5.0;
        weapon11.isLicensed = false;
        System.out.println("Weapon 11: " + weapon11.weaponId + ", " + weapon11.name + ", " + weapon11.type + ", " + weapon11.material + ", " + weapon11.weight + "kg, Licensed: " + weapon11.isLicensed);

        Weapon weapon12 = new Weapon();
        weapon12.weaponId = 12;
        weapon12.name = "Grenade";
        weapon12.type = "Explosive";
        weapon12.material = "Metal";
        weapon12.weight = 0.4;
        weapon12.isLicensed = true;
        System.out.println("Weapon 12: " + weapon12.weaponId + ", " + weapon12.name + ", " + weapon12.type + ", " + weapon12.material + ", " + weapon12.weight + "kg, Licensed: " + weapon12.isLicensed);

        Weapon weapon13 = new Weapon();
        weapon13.weaponId = 13;
        weapon13.name = "Trident";
        weapon13.type = "Polearm";
        weapon13.material = "Bronze";
        weapon13.weight = 3.5;
        weapon13.isLicensed = false;
        System.out.println("Weapon 13: " + weapon13.weaponId + ", " + weapon13.name + ", " + weapon13.type + ", " + weapon13.material + ", " + weapon13.weight + "kg, Licensed: " + weapon13.isLicensed);

        Weapon weapon14 = new Weapon();
        weapon14.weaponId = 14;
        weapon14.name = "Shuriken";
        weapon14.type = "Throwing";
        weapon14.material = "Stainless Steel";
        weapon14.weight = 0.2;
        weapon14.isLicensed = false;
        System.out.println("Weapon 14: " + weapon14.weaponId + ", " + weapon14.name + ", " + weapon14.type + ", " + weapon14.material + ", " + weapon14.weight + "kg, Licensed: " + weapon14.isLicensed);

        Weapon weapon15 = new Weapon();
        weapon15.weaponId = 15;
        weapon15.name = "Baton";
        weapon15.type = "Blunt";
        weapon15.material = "Plastic";
        weapon15.weight = 1.0;
        weapon15.isLicensed = true;
        System.out.println("Weapon 15: " + weapon15.weaponId + ", " + weapon15.name + ", " + weapon15.type + ", " + weapon15.material + ", " + weapon15.weight + "kg, Licensed: " + weapon15.isLicensed);

        Weapon weapon16 = new Weapon();
        weapon16.weaponId = 16;
        weapon16.name = "Boomerang";
        weapon16.type = "Throwing";
        weapon16.material = "Wood";
        weapon16.weight = 0.7;
        weapon16.isLicensed = false;
        System.out.println("Weapon 16: " + weapon16.weaponId + ", " + weapon16.name + ", " + weapon16.type + ", " + weapon16.material + ", " + weapon16.weight + "kg, Licensed: " + weapon16.isLicensed);

        Weapon weapon17 = new Weapon();
        weapon17.weaponId = 17;
        weapon17.name = "Slingshot";
        weapon17.type = "Projectile";
        weapon17.material = "Rubber";
        weapon17.weight = 0.3;
        weapon17.isLicensed = false;
        System.out.println("Weapon 17: " + weapon17.weaponId + ", " + weapon17.name + ", " + weapon17.type + ", " + weapon17.material + ", " + weapon17.weight + "kg, Licensed: " + weapon17.isLicensed);

        Weapon weapon18 = new Weapon();
        weapon18.weaponId = 18;
        weapon18.name = "Bazooka";
        weapon18.type = "Launcher";
        weapon18.material = "Alloy";
        weapon18.weight = 12.0;
        weapon18.isLicensed = true;
        System.out.println("Weapon 18: " + weapon18.weaponId + ", " + weapon18.name + ", " + weapon18.type + ", " + weapon18.material + ", " + weapon18.weight + "kg, Licensed: " + weapon18.isLicensed);

        Weapon weapon19 = new Weapon();
        weapon19.weaponId = 19;
        weapon19.name = "Whip";
        weapon19.type = "Flexible";
        weapon19.material = "Leather";
        weapon19.weight = 1.1;
        weapon19.isLicensed = false;
        System.out.println("Weapon 19: " + weapon19.weaponId + ", " + weapon19.name + ", " + weapon19.type + ", " + weapon19.material + ", " + weapon19.weight + "kg, Licensed: " + weapon19.isLicensed);

        Weapon weapon20 = new Weapon();
        weapon20.weaponId = 20;
        weapon20.name = "Sabre";
        weapon20.type = "Sword";
        weapon20.material = "Steel";
        weapon20.weight = 2.2;
        weapon20.isLicensed = true;
        System.out.println("Weapon 20: " + weapon20.weaponId + ", " + weapon20.name + ", " + weapon20.type + ", " + weapon20.material + ", " + weapon20.weight + "kg, Licensed: " + weapon20.isLicensed);

        System.out.println("main ended");
    }
}

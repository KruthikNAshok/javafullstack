class PipeRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Pipe pipe1 = new Pipe();
        pipe1.pipeId = 1;
        pipe1.material = "PVC";
        pipe1.length = 6.0;
        pipe1.diameter = 1.5;
        pipe1.isFlexible = false;
        pipe1.usage = "Water supply";
        pipe1.printDetails();

        Pipe pipe2 = new Pipe();
        pipe2.pipeId = 2;
        pipe2.material = "Copper";
        pipe2.length = 4.5;
        pipe2.diameter = 1.0;
        pipe2.isFlexible = false;
        pipe2.usage = "Gas line";
        pipe2.printDetails();

        Pipe pipe3 = new Pipe();
        pipe3.pipeId = 3;
        pipe3.material = "Steel";
        pipe3.length = 5.5;
        pipe3.diameter = 2.0;
        pipe3.isFlexible = false;
        pipe3.usage = "Industrial piping";
        pipe3.printDetails();

        Pipe pipe4 = new Pipe();
        pipe4.pipeId = 4;
        pipe4.material = "CPVC";
        pipe4.length = 3.0;
        pipe4.diameter = 0.75;
        pipe4.isFlexible = false;
        pipe4.usage = "Hot water line";
        pipe4.printDetails();

        Pipe pipe5 = new Pipe();
        pipe5.pipeId = 5;
        pipe5.material = "HDPE";
        pipe5.length = 10.0;
        pipe5.diameter = 3.0;
        pipe5.isFlexible = true;
        pipe5.usage = "Irrigation";
        pipe5.printDetails();

        Pipe pipe6 = new Pipe();
        pipe6.pipeId = 6;
        pipe6.material = "PEX";
        pipe6.length = 6.5;
        pipe6.diameter = 1.25;
        pipe6.isFlexible = true;
        pipe6.usage = "Domestic plumbing";
        pipe6.printDetails();

        Pipe pipe7 = new Pipe();
        pipe7.pipeId = 7;
        pipe7.material = "Galvanized Iron";
        pipe7.length = 7.0;
        pipe7.diameter = 2.5;
        pipe7.isFlexible = false;
        pipe7.usage = "Sewage";
        pipe7.printDetails();

        Pipe pipe8 = new Pipe();
        pipe8.pipeId = 8;
        pipe8.material = "Concrete";
        pipe8.length = 12.0;
        pipe8.diameter = 4.0;
        pipe8.isFlexible = false;
        pipe8.usage = "Drainage";
        pipe8.printDetails();

        Pipe pipe9 = new Pipe();
        pipe9.pipeId = 9;
        pipe9.material = "Clay";
        pipe9.length = 4.0;
        pipe9.diameter = 2.0;
        pipe9.isFlexible = false;
        pipe9.usage = "Old sewer lines";
        pipe9.printDetails();

        Pipe pipe10 = new Pipe();
        pipe10.pipeId = 10;
        pipe10.material = "Brass";
        pipe10.length = 3.5;
        pipe10.diameter = 1.0;
        pipe10.isFlexible = false;
        pipe10.usage = "Residential plumbing";
        pipe10.printDetails();

        Pipe pipe11 = new Pipe();
        pipe11.pipeId = 11;
        pipe11.material = "Aluminum";
        pipe11.length = 8.0;
        pipe11.diameter = 2.25;
        pipe11.isFlexible = true;
        pipe11.usage = "HVAC ducting";
        pipe11.printDetails();

        Pipe pipe12 = new Pipe();
        pipe12.pipeId = 12;
        pipe12.material = "Lead";
        pipe12.length = 3.0;
        pipe12.diameter = 0.5;
        pipe12.isFlexible = false;
        pipe12.usage = "Old plumbing";
        pipe12.printDetails();

        Pipe pipe13 = new Pipe();
        pipe13.pipeId = 13;
        pipe13.material = "Fiber Glass";
        pipe13.length = 9.0;
        pipe13.diameter = 3.5;
        pipe13.isFlexible = false;
        pipe13.usage = "Chemical transport";
        pipe13.printDetails();

        Pipe pipe14 = new Pipe();
        pipe14.pipeId = 14;
        pipe14.material = "Cast Iron";
        pipe14.length = 6.0;
        pipe14.diameter = 2.5;
        pipe14.isFlexible = false;
        pipe14.usage = "Drainage";
        pipe14.printDetails();

        Pipe pipe15 = new Pipe();
        pipe15.pipeId = 15;
        pipe15.material = "Rubber";
        pipe15.length = 5.0;
        pipe15.diameter = 1.75;
        pipe15.isFlexible = true;
        pipe15.usage = "Temporary connections";
        pipe15.printDetails();

        Pipe pipe16 = new Pipe();
        pipe16.pipeId = 16;
        pipe16.material = "Plastic";
        pipe16.length = 7.0;
        pipe16.diameter = 1.5;
        pipe16.isFlexible = true;
        pipe16.usage = "Aquarium piping";
        pipe16.printDetails();

        Pipe pipe17 = new Pipe();
        pipe17.pipeId = 17;
        pipe17.material = "Silicone";
        pipe17.length = 2.0;
        pipe17.diameter = 0.75;
        pipe17.isFlexible = true;
        pipe17.usage = "Lab setups";
        pipe17.printDetails();

        Pipe pipe18 = new Pipe();
        pipe18.pipeId = 18;
        pipe18.material = "Carbon Steel";
        pipe18.length = 8.5;
        pipe18.diameter = 3.0;
        pipe18.isFlexible = false;
        pipe18.usage = "Heavy industries";
        pipe18.printDetails();

        Pipe pipe19 = new Pipe();
        pipe19.pipeId = 19;
        pipe19.material = "Vinyl";
        pipe19.length = 4.0;
        pipe19.diameter = 1.0;
        pipe19.isFlexible = true;
        pipe19.usage = "Garden hoses";
        pipe19.printDetails();

        Pipe pipe20 = new Pipe();
        pipe20.pipeId = 20;
        pipe20.material = "Stainless Steel";
        pipe20.length = 9.0;
        pipe20.diameter = 2.0;
        pipe20.isFlexible = false;
        pipe20.usage = "Food processing";
        pipe20.printDetails();

        System.out.println("main ended");
    }
}

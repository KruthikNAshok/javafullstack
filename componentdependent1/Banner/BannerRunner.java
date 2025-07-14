class BannerRunner {

    public static void main(String[] args) {

        boolean bannerIsRegistered = Banner.registerBanner("Welcome to Java World", "Blue", "Arial", 24, true, "FadeIn");

        System.out.println("Is banner registered: " + bannerIsRegistered);

        if (bannerIsRegistered) {
            Banner.getBannerInfo();
        }
    }
}

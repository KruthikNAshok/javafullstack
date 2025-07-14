class Banner {

    static String bannerText;
    static String backgroundColor;
    static String fontStyle;
    static int fontSize;
    static boolean isVisible;
    static String animationStyle;

    public static boolean registerBanner(String text, String bgColor, String font, int size, boolean visible, String animation) {

        boolean isBannerRegistered = false;

        boolean textValid = false;
        boolean bgColorValid = false;
        boolean fontStyleValid = false;
        boolean fontSizeValid = false;
        boolean visibilityValid = false;
        boolean animationValid = false;

        if (text != null) {
            bannerText = text;
            textValid = true;
        } else {
            System.out.println("Enter valid banner text");
        }

        if (bgColor != null) {
            backgroundColor = bgColor;
            bgColorValid = true;
        } else {
            System.out.println("Enter valid background color");
        }

        if (font != null) {
            fontStyle = font;
            fontStyleValid = true;
        } else {
            System.out.println("Enter valid font style");
        }

        if (size > 0) {
            fontSize = size;
            fontSizeValid = true;
        } else {
            System.out.println("Font size must be greater than 0");
        }

        isVisible = visible;
        visibilityValid = true;

        if (animation != null) {
            animationStyle = animation;
            animationValid = true;
        } else {
            System.out.println("Enter valid animation style");
        }

        if (textValid && bgColorValid && fontStyleValid && fontSizeValid && visibilityValid && animationValid) {
            isBannerRegistered = true;
        } else {
            System.out.println("Banner is not registered");
        }

        return isBannerRegistered;
    }

    public static void getBannerInfo() {
        System.out.println("Banner Text: " + bannerText);
        System.out.println("Background Color: " + backgroundColor);
        System.out.println("Font Style: " + fontStyle);
        System.out.println("Font Size: " + fontSize);
        System.out.println("Is Visible: " + isVisible);
        System.out.println("Animation Style: " + animationStyle);
    }
}

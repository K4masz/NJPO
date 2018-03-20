import Sites.*;

/**
 * Created by K4masz on 2017-11-15.
 */
public class SiteFactory {
    public static Site createSite(ESiteType type) {

        switch (type) {
            case IMAGE_GALLERY:
                return new ImageGallerySite();

            case CONTACT:
                return new ContactSite();

            case INFORMATION:
                return new InformationSite();

            case NEWS:
                return new NewsSite();

            case BLANK:
                return new Site();

        }
    return null;
    }
}

package example.develop.davidoh.cardlistuidesign;

public class Item {

    int background;
    String profileName;
    int profilePhoto;
    int nbFollwers;

    public Item() {
    }

    public Item(int background, String profileName, int profilePhoto, int nbFollwers) {
        this.background = background;
        this.profileName = profileName;
        this.profilePhoto = profilePhoto;
        this.nbFollwers = nbFollwers;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getNbFollwers() {
        return nbFollwers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setNbFollwers(int nbFollwers) {
        this.nbFollwers = nbFollwers;
    }
}

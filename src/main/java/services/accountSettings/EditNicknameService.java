package services.accountSettings;

import pages.accountSettings.MyProfilePage;
import utils.Logger;

public class EditNicknameService {

    private final MyProfilePage editNickname = new MyProfilePage();

    public void clickEditNickname() {
        Logger.info("Click edit nickname on the MyProfilePage");
        editNickname.getEditNickname().click();
    }

    public void fillAllRequiredFieldsNickname(final String firstName, final String lastName) {
        Logger.info("Fill all required fields nickname on the MyProfilePage");
        editNickname.getFirstName().clearAndType(firstName);
        editNickname.getLastName().clearAndType(lastName);
    }

    public void clickSaveNickname() {
        Logger.info("Click save nickname on the MyProfilePage");
        editNickname.getSaveNickname().click();
    }

    public boolean saveNicknameIsVisible() {
        Logger.info("Save nickname is visible on the MyProfilePage");
        editNickname.getIsEditNickname().waitUntil();
        return editNickname.getIsEditNickname().isVisible();
    }
}

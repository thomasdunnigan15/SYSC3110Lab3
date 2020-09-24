import java.util.LinkedList;

public class AddressBook{
    private LinkedList<BuddyInfo> addressBook;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom",17);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    private void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }
}
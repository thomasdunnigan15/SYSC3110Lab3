import java.util.LinkedList;

public class AddressBook{
    private LinkedList<BuddyInfo> addressBook;

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    private void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }
}
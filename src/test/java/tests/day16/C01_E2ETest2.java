package tests.day16;

import org.testng.annotations.Test;
import pages.QAConcortPage;

public class C01_E2ETest2 {


    public void RoomCreateTest() {
        QAConcortPage qaConcortPage = new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        qaConcortPage.hotelManagementLinki.click();
        qaConcortPage.hotelRoomsLinki.click();

    }
}

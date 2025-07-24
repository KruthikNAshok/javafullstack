class FestivalRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Festival festival1 = new Festival();
        festival1.name = "Diwali";
        festival1.region = "All India";
        festival1.mainDeityOrEvent = "Lord Rama";
        festival1.durationDays = 5;
        festival1.isPublicHoliday = true;
        festival1.monthCelebrated = "October";
        System.out.println("Festival 1: " + festival1.name + ", " + festival1.region + ", " + festival1.mainDeityOrEvent + ", " + festival1.durationDays + " days, Public Holiday: " + festival1.isPublicHoliday + ", Month: " + festival1.monthCelebrated);

        Festival festival2 = new Festival();
        festival2.name = "Holi";
        festival2.region = "North India";
        festival2.mainDeityOrEvent = "Lord Krishna";
        festival2.durationDays = 2;
        festival2.isPublicHoliday = true;
        festival2.monthCelebrated = "March";
        System.out.println("Festival 2: " + festival2.name + ", " + festival2.region + ", " + festival2.mainDeityOrEvent + ", " + festival2.durationDays + " days, Public Holiday: " + festival2.isPublicHoliday + ", Month: " + festival2.monthCelebrated);

        Festival festival3 = new Festival();
        festival3.name = "Eid al-Fitr";
        festival3.region = "All India";
        festival3.mainDeityOrEvent = "End of Ramadan";
        festival3.durationDays = 1;
        festival3.isPublicHoliday = true;
        festival3.monthCelebrated = "April";
        System.out.println("Festival 3: " + festival3.name + ", " + festival3.region + ", " + festival3.mainDeityOrEvent + ", " + festival3.durationDays + " days, Public Holiday: " + festival3.isPublicHoliday + ", Month: " + festival3.monthCelebrated);

        Festival festival4 = new Festival();
        festival4.name = "Christmas";
        festival4.region = "All India";
        festival4.mainDeityOrEvent = "Birth of Jesus Christ";
        festival4.durationDays = 1;
        festival4.isPublicHoliday = true;
        festival4.monthCelebrated = "December";
        System.out.println("Festival 4: " + festival4.name + ", " + festival4.region + ", " + festival4.mainDeityOrEvent + ", " + festival4.durationDays + " days, Public Holiday: " + festival4.isPublicHoliday + ", Month: " + festival4.monthCelebrated);

        Festival festival5 = new Festival();
        festival5.name = "Onam";
        festival5.region = "Kerala";
        festival5.mainDeityOrEvent = "King Mahabali";
        festival5.durationDays = 10;
        festival5.isPublicHoliday = true;
        festival5.monthCelebrated = "August";
        System.out.println("Festival 5: " + festival5.name + ", " + festival5.region + ", " + festival5.mainDeityOrEvent + ", " + festival5.durationDays + " days, Public Holiday: " + festival5.isPublicHoliday + ", Month: " + festival5.monthCelebrated);

        Festival festival6 = new Festival();
        festival6.name = "Pongal";
        festival6.region = "Tamil Nadu";
        festival6.mainDeityOrEvent = "Sun God";
        festival6.durationDays = 4;
        festival6.isPublicHoliday = true;
        festival6.monthCelebrated = "January";
        System.out.println("Festival 6: " + festival6.name + ", " + festival6.region + ", " + festival6.mainDeityOrEvent + ", " + festival6.durationDays + " days, Public Holiday: " + festival6.isPublicHoliday + ", Month: " + festival6.monthCelebrated);

        Festival festival7 = new Festival();
        festival7.name = "Navratri";
        festival7.region = "All India";
        festival7.mainDeityOrEvent = "Goddess Durga";
        festival7.durationDays = 9;
        festival7.isPublicHoliday = false;
        festival7.monthCelebrated = "October";
        System.out.println("Festival 7: " + festival7.name + ", " + festival7.region + ", " + festival7.mainDeityOrEvent + ", " + festival7.durationDays + " days, Public Holiday: " + festival7.isPublicHoliday + ", Month: " + festival7.monthCelebrated);

        Festival festival8 = new Festival();
        festival8.name = "Ganesh Chaturthi";
        festival8.region = "Maharashtra";
        festival8.mainDeityOrEvent = "Lord Ganesha";
        festival8.durationDays = 11;
        festival8.isPublicHoliday = true;
        festival8.monthCelebrated = "September";
        System.out.println("Festival 8: " + festival8.name + ", " + festival8.region + ", " + festival8.mainDeityOrEvent + ", " + festival8.durationDays + " days, Public Holiday: " + festival8.isPublicHoliday + ", Month: " + festival8.monthCelebrated);

        Festival festival9 = new Festival();
        festival9.name = "Dussehra";
        festival9.region = "All India";
        festival9.mainDeityOrEvent = "Victory of Rama";
        festival9.durationDays = 1;
        festival9.isPublicHoliday = true;
        festival9.monthCelebrated = "October";
        System.out.println("Festival 9: " + festival9.name + ", " + festival9.region + ", " + festival9.mainDeityOrEvent + ", " + festival9.durationDays + " days, Public Holiday: " + festival9.isPublicHoliday + ", Month: " + festival9.monthCelebrated);

        Festival festival10 = new Festival();
        festival10.name = "Raksha Bandhan";
        festival10.region = "North India";
        festival10.mainDeityOrEvent = "Bond of Siblings";
        festival10.durationDays = 1;
        festival10.isPublicHoliday = false;
        festival10.monthCelebrated = "August";
        System.out.println("Festival 10: " + festival10.name + ", " + festival10.region + ", " + festival10.mainDeityOrEvent + ", " + festival10.durationDays + " days, Public Holiday: " + festival10.isPublicHoliday + ", Month: " + festival10.monthCelebrated);

        Festival festival11 = new Festival();
        festival11.name = "Janmashtami";
        festival11.region = "All India";
        festival11.mainDeityOrEvent = "Lord Krishna";
        festival11.durationDays = 2;
        festival11.isPublicHoliday = true;
        festival11.monthCelebrated = "August";
        System.out.println("Festival 11: " + festival11.name + ", " + festival11.region + ", " + festival11.mainDeityOrEvent + ", " + festival11.durationDays + " days, Public Holiday: " + festival11.isPublicHoliday + ", Month: " + festival11.monthCelebrated);

        Festival festival12 = new Festival();
        festival12.name = "Mahashivratri";
        festival12.region = "All India";
        festival12.mainDeityOrEvent = "Lord Shiva";
        festival12.durationDays = 1;
        festival12.isPublicHoliday = false;
        festival12.monthCelebrated = "March";
        System.out.println("Festival 12: " + festival12.name + ", " + festival12.region + ", " + festival12.mainDeityOrEvent + ", " + festival12.durationDays + " days, Public Holiday: " + festival12.isPublicHoliday + ", Month: " + festival12.monthCelebrated);

        Festival festival13 = new Festival();
        festival13.name = "Gudi Padwa";
        festival13.region = "Maharashtra";
        festival13.mainDeityOrEvent = "New Year";
        festival13.durationDays = 1;
        festival13.isPublicHoliday = true;
        festival13.monthCelebrated = "March";
        System.out.println("Festival 13: " + festival13.name + ", " + festival13.region + ", " + festival13.mainDeityOrEvent + ", " + festival13.durationDays + " days, Public Holiday: " + festival13.isPublicHoliday + ", Month: " + festival13.monthCelebrated);

        Festival festival14 = new Festival();
        festival14.name = "Ugadi";
        festival14.region = "Andhra Pradesh, Karnataka";
        festival14.mainDeityOrEvent = "New Year";
        festival14.durationDays = 1;
        festival14.isPublicHoliday = true;
        festival14.monthCelebrated = "March";
        System.out.println("Festival 14: " + festival14.name + ", " + festival14.region + ", " + festival14.mainDeityOrEvent + ", " + festival14.durationDays + " days, Public Holiday: " + festival14.isPublicHoliday + ", Month: " + festival14.monthCelebrated);

        Festival festival15 = new Festival();
        festival15.name = "Vishu";
        festival15.region = "Kerala";
        festival15.mainDeityOrEvent = "Malayalam New Year";
        festival15.durationDays = 1;
        festival15.isPublicHoliday = true;
        festival15.monthCelebrated = "April";
        System.out.println("Festival 15: " + festival15.name + ", " + festival15.region + ", " + festival15.mainDeityOrEvent + ", " + festival15.durationDays + " days, Public Holiday: " + festival15.isPublicHoliday + ", Month: " + festival15.monthCelebrated);

        Festival festival16 = new Festival();
        festival16.name = "Baisakhi";
        festival16.region = "Punjab";
        festival16.mainDeityOrEvent = "Harvest Festival";
        festival16.durationDays = 1;
        festival16.isPublicHoliday = true;
        festival16.monthCelebrated = "April";
        System.out.println("Festival 16: " + festival16.name + ", " + festival16.region + ", " + festival16.mainDeityOrEvent + ", " + festival16.durationDays + " days, Public Holiday: " + festival16.isPublicHoliday + ", Month: " + festival16.monthCelebrated);

        Festival festival17 = new Festival();
        festival17.name = "Bihu";
        festival17.region = "Assam";
        festival17.mainDeityOrEvent = "Harvest Festival";
        festival17.durationDays = 7;
        festival17.isPublicHoliday = true;
        festival17.monthCelebrated = "April";
        System.out.println("Festival 17: " + festival17.name + ", " + festival17.region + ", " + festival17.mainDeityOrEvent + ", " + festival17.durationDays + " days, Public Holiday: " + festival17.isPublicHoliday + ", Month: " + festival17.monthCelebrated);

        Festival festival18 = new Festival();
        festival18.name = "Chhath Puja";
        festival18.region = "Bihar";
        festival18.mainDeityOrEvent = "Sun God";
        festival18.durationDays = 4;
        festival18.isPublicHoliday = false;
        festival18.monthCelebrated = "November";
        System.out.println("Festival 18: " + festival18.name + ", " + festival18.region + ", " + festival18.mainDeityOrEvent + ", " + festival18.durationDays + " days, Public Holiday: " + festival18.isPublicHoliday + ", Month: " + festival18.monthCelebrated);

        Festival festival19 = new Festival();
        festival19.name = "Buddha Purnima";
        festival19.region = "All India";
        festival19.mainDeityOrEvent = "Lord Buddha";
        festival19.durationDays = 1;
        festival19.isPublicHoliday = true;
        festival19.monthCelebrated = "May";
        System.out.println("Festival 19: " + festival19.name + ", " + festival19.region + ", " + festival19.mainDeityOrEvent + ", " + festival19.durationDays + " days, Public Holiday: " + festival19.isPublicHoliday + ", Month: " + festival19.monthCelebrated);

        Festival festival20 = new Festival();
        festival20.name = "Guru Nanak Jayanti";
        festival20.region = "Punjab";
        festival20.mainDeityOrEvent = "Guru Nanak";
        festival20.durationDays = 1;
        festival20.isPublicHoliday = true;
        festival20.monthCelebrated = "November";
        System.out.println("Festival 20: " + festival20.name + ", " + festival20.region + ", " + festival20.mainDeityOrEvent + ", " + festival20.durationDays + " days, Public Holiday: " + festival20.isPublicHoliday + ", Month: " + festival20.monthCelebrated);

        System.out.println("Main ended");
    }
}

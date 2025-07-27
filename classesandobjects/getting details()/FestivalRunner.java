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
        festival1.printDetails();

        Festival festival2 = new Festival();
        festival2.name = "Holi";
        festival2.region = "North India";
        festival2.mainDeityOrEvent = "Lord Krishna";
        festival2.durationDays = 2;
        festival2.isPublicHoliday = true;
        festival2.monthCelebrated = "March";
        festival2.printDetails();

        Festival festival3 = new Festival();
        festival3.name = "Eid al-Fitr";
        festival3.region = "All India";
        festival3.mainDeityOrEvent = "End of Ramadan";
        festival3.durationDays = 1;
        festival3.isPublicHoliday = true;
        festival3.monthCelebrated = "April";
        festival3.printDetails();

        Festival festival4 = new Festival();
        festival4.name = "Christmas";
        festival4.region = "All India";
        festival4.mainDeityOrEvent = "Birth of Jesus Christ";
        festival4.durationDays = 1;
        festival4.isPublicHoliday = true;
        festival4.monthCelebrated = "December";
        festival4.printDetails();

        Festival festival5 = new Festival();
        festival5.name = "Onam";
        festival5.region = "Kerala";
        festival5.mainDeityOrEvent = "King Mahabali";
        festival5.durationDays = 10;
        festival5.isPublicHoliday = true;
        festival5.monthCelebrated = "August";
        festival5.printDetails();

        Festival festival6 = new Festival();
        festival6.name = "Pongal";
        festival6.region = "Tamil Nadu";
        festival6.mainDeityOrEvent = "Sun God";
        festival6.durationDays = 4;
        festival6.isPublicHoliday = true;
        festival6.monthCelebrated = "January";
        festival6.printDetails();

        Festival festival7 = new Festival();
        festival7.name = "Navratri";
        festival7.region = "All India";
        festival7.mainDeityOrEvent = "Goddess Durga";
        festival7.durationDays = 9;
        festival7.isPublicHoliday = false;
        festival7.monthCelebrated = "October";
        festival7.printDetails();

        Festival festival8 = new Festival();
        festival8.name = "Ganesh Chaturthi";
        festival8.region = "Maharashtra";
        festival8.mainDeityOrEvent = "Lord Ganesha";
        festival8.durationDays = 11;
        festival8.isPublicHoliday = true;
        festival8.monthCelebrated = "September";
        festival8.printDetails();

        Festival festival9 = new Festival();
        festival9.name = "Dussehra";
        festival9.region = "All India";
        festival9.mainDeityOrEvent = "Victory of Rama";
        festival9.durationDays = 1;
        festival9.isPublicHoliday = true;
        festival9.monthCelebrated = "October";
        festival9.printDetails();

        Festival festival10 = new Festival();
        festival10.name = "Raksha Bandhan";
        festival10.region = "North India";
        festival10.mainDeityOrEvent = "Bond of Siblings";
        festival10.durationDays = 1;
        festival10.isPublicHoliday = false;
        festival10.monthCelebrated = "August";
        festival10.printDetails();

        Festival festival11 = new Festival();
        festival11.name = "Janmashtami";
        festival11.region = "All India";
        festival11.mainDeityOrEvent = "Lord Krishna";
        festival11.durationDays = 2;
        festival11.isPublicHoliday = true;
        festival11.monthCelebrated = "August";
        festival11.printDetails();

        Festival festival12 = new Festival();
        festival12.name = "Mahashivratri";
        festival12.region = "All India";
        festival12.mainDeityOrEvent = "Lord Shiva";
        festival12.durationDays = 1;
        festival12.isPublicHoliday = false;
        festival12.monthCelebrated = "March";
        festival12.printDetails();

        Festival festival13 = new Festival();
        festival13.name = "Gudi Padwa";
        festival13.region = "Maharashtra";
        festival13.mainDeityOrEvent = "New Year";
        festival13.durationDays = 1;
        festival13.isPublicHoliday = true;
        festival13.monthCelebrated = "March";
        festival13.printDetails();

        Festival festival14 = new Festival();
        festival14.name = "Ugadi";
        festival14.region = "Andhra Pradesh, Karnataka";
        festival14.mainDeityOrEvent = "New Year";
        festival14.durationDays = 1;
        festival14.isPublicHoliday = true;
        festival14.monthCelebrated = "March";
        festival14.printDetails();

        Festival festival15 = new Festival();
        festival15.name = "Vishu";
        festival15.region = "Kerala";
        festival15.mainDeityOrEvent = "Malayalam New Year";
        festival15.durationDays = 1;
        festival15.isPublicHoliday = true;
        festival15.monthCelebrated = "April";
        festival15.printDetails();

        Festival festival16 = new Festival();
        festival16.name = "Baisakhi";
        festival16.region = "Punjab";
        festival16.mainDeityOrEvent = "Harvest Festival";
        festival16.durationDays = 1;
        festival16.isPublicHoliday = true;
        festival16.monthCelebrated = "April";
        festival16.printDetails();

        Festival festival17 = new Festival();
        festival17.name = "Bihu";
        festival17.region = "Assam";
        festival17.mainDeityOrEvent = "Harvest Festival";
        festival17.durationDays = 7;
        festival17.isPublicHoliday = true;
        festival17.monthCelebrated = "April";
        festival17.printDetails();

        Festival festival18 = new Festival();
        festival18.name = "Chhath Puja";
        festival18.region = "Bihar";
        festival18.mainDeityOrEvent = "Sun God";
        festival18.durationDays = 4;
        festival18.isPublicHoliday = false;
        festival18.monthCelebrated = "November";
        festival18.printDetails();

        Festival festival19 = new Festival();
        festival19.name = "Buddha Purnima";
        festival19.region = "All India";
        festival19.mainDeityOrEvent = "Lord Buddha";
        festival19.durationDays = 1;
        festival19.isPublicHoliday = true;
        festival19.monthCelebrated = "May";
        festival19.printDetails();

        Festival festival20 = new Festival();
        festival20.name = "Guru Nanak Jayanti";
        festival20.region = "Punjab";
        festival20.mainDeityOrEvent = "Guru Nanak";
        festival20.durationDays = 1;
        festival20.isPublicHoliday = true;
        festival20.monthCelebrated = "November";
        festival20.printDetails();

        System.out.println("Main ended");
    }
}

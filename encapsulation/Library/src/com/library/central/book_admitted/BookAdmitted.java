package com.library.central.book_admitted;

import com.library.central.book_details.BookDetails;
import com.library.central.book_validate.BookValidate;

public class BookAdmitted {

    BookDetails details;

    public boolean isAdmitted(BookDetails details){
        boolean validated = false;

        BookValidate val = new BookValidate();
        boolean result = val.validated(details);

        if(result){
            this.details = details;
            validated = true;
            val.getBookInfo();
        } else {
            System.out.println("This is Not A Valid Book...!");
        }
        return validated;
    }
}

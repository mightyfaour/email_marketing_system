package com.philip.email_marketing_system.optionuser;

import com.philip.email_marketing_system.controllers.Control;

public class FreeUserPackage {

    public Control getEmailControl() {
        return new Control.MailjetControl();
    }

}

package com.philip.email_marketing_system.optionuser;

import com.philip.email_marketing_system.controllers.Control;

import java.util.ArrayList;
import java.util.List;

public class BasicPaidUserPackage {

    public Control getEmailControl() {
        List<Control> emailControls = new ArrayList<>();
        emailControls.add(new Control.MailgunControl());
        emailControls.add(new Control.SendgridControl());
        return new RandomControl(emailControls);
    }

}

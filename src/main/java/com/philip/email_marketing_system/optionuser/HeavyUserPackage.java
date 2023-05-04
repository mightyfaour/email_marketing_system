package com.philip.email_marketing_system.optionuser;

import com.philip.email_marketing_system.controllers.Control;

import java.util.ArrayList;
import java.util.List;

public class HeavyUserPackage {

    public Control getEmailControl() {
        List<Control> emailControls = new ArrayList<>();
        emailControls.add(new Control.AWSControl());
        emailControls.add(new Control.PostmarkControl());
        return new RandomControl(emailControls);
    }

}

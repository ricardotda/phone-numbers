package com.example.maskphonenumbers;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView phoneNumbers = (TextView) findViewById(R.id.phoneNumbers);
        TextView formattedphoneNumbers = (TextView) findViewById(R.id.formattedphoneNumbers);

        String contact0 = "98765432";
        String phoneNumberContact0 = contact0.replaceAll("[^0-9.,]+","");
        String formattedNumber0 = new PhoneNumber(phoneNumberContact0).address();

        String contact1 = "987654321";
        String phoneNumberContact1 = contact1.replaceAll("[^0-9.,]+","");
        String formattedNumber1 = new PhoneNumber(phoneNumberContact1).address();

        String contact2 = "21987654321";
        String phoneNumberContact2 = contact2.replaceAll("[^0-9.,]+","");
        String formattedNumber2 = new PhoneNumber(phoneNumberContact2).address();

        String contact3 = "9198765432";
        String phoneNumberContact3 = contact3.replaceAll("[^0-9.,]+","");
        String formattedNumber3 = new PhoneNumber(phoneNumberContact3).address();

        String contact4 = "021987654321";
        String phoneNumberContact4 = contact4.replaceAll("[^0-9.,]+","");
        String formattedNumber4 = new PhoneNumber(phoneNumberContact4).address();

        String contact5 = "09198765432";
        String phoneNumberContact5 = contact5.replaceAll("[^0-9.,]+","");
        String formattedNumber5 = new PhoneNumber(phoneNumberContact5).address();

        String contact6 = "1521987654321";
        String phoneNumberContact6 = contact6.replaceAll("[^0-9.,]+","");
        String formattedNumber6 = new PhoneNumber(phoneNumberContact6).address();

        String contact7 = "159198765432";
        String phoneNumberContact7 = contact7.replaceAll("[^0-9.,]+","");
        String formattedNumber7 = new PhoneNumber(phoneNumberContact7).address();

        String contact8 = "01521987654321";
        String phoneNumberContact8 = contact8.replaceAll("[^0-9.,]+","");
        String formattedNumber8 = new PhoneNumber(phoneNumberContact8).address();

        String contact9 = "0159198765432";
        String phoneNumberContact9 = contact9.replaceAll("[^0-9.,]+","");
        String formattedNumber9 = new PhoneNumber(phoneNumberContact9).address();

        phoneNumbers.setText(contact0 + "\n" + contact1 + "\n" + contact2 + "\n" + contact3 +
                "\n" + contact4 + "\n" + contact5 + "\n" + contact6 + "\n" +
                contact7 + "\n" + contact8 + "\n" + contact9);

        formattedphoneNumbers.setText(formattedNumber0 + "\n" + formattedNumber1 + "\n" +
                formattedNumber2 + "\n" + formattedNumber3 + "\n" + formattedNumber4 + "\n" +
                formattedNumber5 + "\n" + formattedNumber6 + "\n" + formattedNumber7 + "\n" +
                formattedNumber8 + "\n" + formattedNumber9);
    }
}

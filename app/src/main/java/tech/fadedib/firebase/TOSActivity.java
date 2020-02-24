package tech.fadedib.firebase;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TOSActivity extends AppCompatActivity {

    Button ExitButton;
    TextView termsTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tos);

        ExitButton = (Button) findViewById(R.id.exitBtn);
        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        termsTextView = (TextView) findViewById(R.id.termsTextView);
        termsTextView.setText("END USER LICENSE AGREEMENT\n" +
                "\n" +
                "Last updated February 24, 2020\n" +
                "\n" +
                "\n" +
                " \n" +
                "Barkr is licensed to You (End-User) by Asian Fit Boys, located at __________, __________, California __________, United States (hereinafter: Licensor), for use only under the terms of this License Agreement.\n" +
                " \n" +
                "By downloading the Application from the Apple AppStore, and any update thereto (as permitted by this License Agreement), You indicate that You agree to be bound by all of the terms and conditions of this License Agreement, and that You accept this License Agreement.\n" +
                " \n" +
                "The parties of this License Agreement acknowledge that Apple is not a Party to this License Agreement and is not bound by any provisions or obligations with regard to the Application, such as warranty, liability, maintenance and support thereof. Asian Fit Boys, not Apple, is solely responsible for the licensed Application and the content thereof.\n" +
                " \n" +
                "This License Agreement may not provide for usage rules for the Application that are in conflict with the latest App Store Terms of Service. Asian Fit Boys acknowledges that it had the opportunity to review said terms and this License Agreement is not conflicting with them.\n" +
                "\n" +
                "All rights not expressly granted to You are reserved.\n" +
                "\n" +
                "1. THE APPLICATION\n" +
                " \n" +
                "Barkr (hereinafter: Application) is a piece of software created to Social interaction app for dog owners - and customized for Apple mobile devices. It is used to Allow dog owners to meet with each other.\n" +
                "\n" +
                "2. SCOPE OF LICENSE\n" +
                " \n" +
                "2.1  You are given a non-transferable, non-exclusive, non-sublicensable license to install and use the Licensed Application on any Apple-branded Products that You (End-User) own or control and as permitted by the Usage Rules set forth in this section and the App Store Terms of Service, with the exception that such licensed Application may be accessed and used by other accounts associated with You (End-User, The Purchaser) via Family Sharing or volume purchasing.\n" +
                "\n" +
                "2.2  You may not reverse engineer, translate, disassemble, integrate, decompile, integrate, remove, modify, combine, create derivative works or updates of, adapt, or attempt to derive the source code of the Application, or any part thereof (except with Asian Fit Boys's prior written consent).\n" +
                "\n" +
                "2.3  You may not copy (excluding when expressly authorized by this license and the Usage Rules) or alter the Application or portions thereof. You may create and store copies only on devices that You own or control for backup keeping under the terms of this license, the App Store Terms of Service, and any other terms and conditions that apply to the device or software used. You may not remove any intellectual property notices. You acknowledge that no unauthorized third parties may gain access to these copies at any time.\n" +
                "\n" +
                "2.4  Violations of the obligations mentioned above, as well as the attempt of such infringement, may be subject to prosecution and damages.\n" +
                "\n" +
                "2.5  Licensor reserves the right to modify the terms and conditions of licensing.\n" +
                "\n" +
                "2.6  Nothing in this license should be interpreted to restrict third-party terms. When using the Application, You must ensure that You comply with applicable third-party terms and conditions.\n" +
                "   \n" +
                "3. TECHNICAL REQUIREMENTS\n" +
                "\n" +
                "3.1  The Application requires a firmware version 1.0.0 or higher. Licensor recommends using the latest version of the firmware.\n" +
                "\n" +
                "3.2  Licensor attempts to keep the Application updated so that it complies with modified/new versions of the firmware and new hardware. You are not granted rights to claim such an update.\n" +
                "\n" +
                "3.3  You acknowledge that it is Your responsibility to confirm and determine that the app end-user device on which You intend to use the Application satisfies the technical  specifications mentioned above.\n" +
                "\n" +
                "3.4  Licensor reserves the right to modify the technical specifications as it sees appropriate at any time.\n" +
                "\n" +
                "4. NO MAINTENANCE OR SUPPORT\n" +
                "\n" +
                "4.1  Asian Fit Boys is not obligated, expressed or implied, to provide any maintenance, technical or other support for the Application.\n" +
                "\n" +
                "4.2  Asian Fit Boys and the End-User acknowledge that Apple has no obligation whatsoever to furnish any maintenance and support services with respect to the licensed Application.\n" +
                "\n" +
                "5. LIABILITY\n" +
                "\n" +
                "5.1  Licensor takes no accountability or responsibility for any damages caused due to a breach of duties according to Section 2 of this Agreement. To avoid data loss, You are required to make use of backup functions of the Application to the extent allowed by applicable third-party terms and conditions of use. You are aware that in case of alterations or manipulations of the Application, You will not have access to licensed Application.\n" +
                "\n" +
                "6. WARRANTY\n" +
                "\n" +
                "6.1  Licensor warrants that the Application is free of spyware, trojan horses, viruses, or any other malware at the time of Your download. Licensor warrants that the Application works as described in the user documentation.\n" +
                "\n" +
                "6.2  No warranty is provided for the Application that is not executable on the device, that has been unauthorizedly modified, handled inappropriately or culpably, combined or installed with inappropriate hardware or software, used with inappropriate accessories, regardless if by Yourself or by third parties, or if there are any other reasons outside of Asian Fit Boys's sphere of influence that affect the executability of the Application.\n" +
                "\n" +
                "6.3  You are required to inspect the Application immediately after installing it and notify Asian Fit Boys about issues discovered without delay by e-mail provided in Product Claims. The defect report will be taken into consideration and further investigated if it has been mailed within a period of __________ days after discovery.\n" +
                "\n" +
                "6.4  If we confirm that the Application is defective, Asian Fit Boys reserves a choice to remedy the situation either by means of solving the defect or substitute delivery.\n" +
                "\n" +
                "6.5  In the event of any failure of the Application to conform to any applicable warranty, You may notify the App-Store-Operator, and Your Application purchase price will be refunded to You. To the maximum extent permitted by applicable law, the App-Store-Operator will have no other warranty obligation whatsoever with respect to the App, and any other losses, claims, damages, liabilities, expenses and costs attributable to any negligence to adhere to any warranty.\n" +
                "           \n" +
                "6.6  If the user is an entrepreneur, any claim based on faults expires after a statutory period of limitation amounting to twelve (12) months after the Application was made available to the user. The statutory periods of limitation given by law apply for users who are consumers.\n" +
                "           \n" +
                "7. PRODUCT CLAIMS\n" +
                " \n" +
                "Asian Fit Boys and the End-User acknowledge that Asian Fit Boys, and not Apple, is responsible for addressing any claims of the End-User or any third party relating to the licensed Application or the End-User’s possession and/or use of that licensed Application, including, but not limited to:\n" +
                " \n" +
                "(i) product liability claims;\n" +
                "           \n" +
                "(ii) any claim that the licensed Application fails to conform to any applicable legal or regulatory requirement; and\n" +
                "           \n" +
                "(iii) claims arising under consumer protection, privacy, or similar legislation, including in connection with Your Licensed Application’s use of the HealthKit and HomeKit.\n" +
                "   \n" +
                "8. LEGAL COMPLIANCE\n" +
                "    \n" +
                "You represent and warrant that You are not located in a country that is subject to a U.S. Government embargo, or that has been designated by the U.S. Government as a \"terrorist supporting\" country; and that You are not listed on any U.S. Government list of prohibited or restricted parties.\n" +
                "   \n" +
                "9. CONTACT INFORMATION                  \n" +
                "     \n" +
                "For general inquiries, complaints, questions or claims concerning the licensed Application, please contact:\n" +
                "     \n" +
                "Barkr Support Desk\n" +
                "__________\n" +
                "__________, __________ __________\n" +
                "__________\n" +
                "barkrsupportdesk@gmail.com\n" +
                "                          \n" +
                "10. TERMINATION       \n" +
                "    \n" +
                "The license is valid until terminated by Asian Fit Boys or by You. Your rights under this license will terminate automatically and without notice from Asian Fit Boys if You fail to adhere to any term(s) of this license. Upon License termination, You shall stop all use of the Application, and destroy all copies, full or partial, of the Application.\n" +
                "              \n" +
                "11. THIRD-PARTY TERMS OF AGREEMENTS AND BENEFICIARY\n" +
                " \n" +
                "Asian Fit Boys represents and warrants that Asian Fit Boys will comply with applicable third-party terms of agreement when using licensed Application.\n" +
                " \n" +
                "In Accordance with Section 9 of the \"Instructions for Minimum Terms of Developer's End-User License Agreement,\" Apple and Apple's subsidiaries shall be third-party beneficiaries of this End User License Agreement and - upon Your acceptance of the terms and conditions of this license agreement, Apple will have the right (and will be deemed to have accepted the right) to enforce this End User License Agreement against You as a third-party beneficiary thereof.\n" +
                " \n" +
                "12. INTELLECTUAL PROPERTY RIGHTS\n" +
                " \n" +
                "Asian Fit Boys and the End-User acknowledge that, in the event of any third-party claim that the licensed Application or the End-User's possession and use of that licensed Application infringes on the third party's intellectual property rights, Asian Fit Boys, and not Apple, will be solely responsible for the investigation, defense, settlement and discharge or any such intellectual property infringement claims.\n" +
                " \n" +
                "13. APPLICABLE LAW\n" +
                " \n" +
                "This license agreement is governed by the laws of the State of California excluding its conflicts of law rules.\n" +
                " \n" +
                "14. MISCELLANEOUS\n" +
                "          \n" +
                "14.1  If any of the terms of this agreement should be or become invalid, the validity of the remaining provisions shall not be affected. Invalid terms will be replaced by valid ones formulated in a way that will achieve the primary purpose.\n" +
                "             \n" +
                "14.2  Collateral agreements, changes and amendments are only valid if laid down in writing. The preceding clause can only be waived in writing.");

        termsTextView.setMovementMethod(new ScrollingMovementMethod());
    }
}

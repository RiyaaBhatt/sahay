import java.util.*;
class NGOr {
    Scanner sc=new Scanner(System.in);
    int sr_no,fund_raised,fund_req;
    String NGO_name,Act,City;//AddAct;
    boolean comp;
    int l=6;
    void Add(){
        sr_no=l;
        System.out.print("Enter NGO name: ");
        NGO_name=sc.nextLine();
        System.out.print("Enter Activity: ");
        Act=sc.nextLine();
        System.out.print("Funds required: ");
        fund_req=sc.nextInt();
		  System.out.print("Enter city");
		  City=sc.next();
    }
    void display(NGOr n[],int k){
        for(int o=0;o<k;o++){
            System.out.println((o+1)+") NGO: "+n[o].NGO_name);
            System.out.println("   Activity: "+n[o].Act);
            System.out.println("   City: "+n[o].City);
            System.out.println("   Fund raised: "+n[o].fund_raised);
            System.out.println("   Fund Required: "+n[o].fund_req);
            System.out.println();
        }
    }
}
class member {
    Scanner sc = new Scanner(System.in);
    long ph_no;
    String name, email, city;

    void find_wrt_type() {
        System.out.println("There are multiple type of NGOs. They are");
        System.out.println("1)CHARITABLE ORIENTATION \n2)SERVICE ORIENTATION \n3)PARTICIPATORY ORIENTATION \n4)EMPOWERING ORIETATAION");
        System.out.println("Please enter ur choice");
        int x12 = sc.nextInt();

        switch (x12) {
            case 1:
                System.out.println("CHARITABLE NGOs:focuses on fulfilling the necessities of the lower income group communities with the aid of clothing, medicine, food distribution drives, housing facility, school, transport, etc.");
                System.out.println("These NGOs work actively during natural calamities and emergency situations. They play an important role by providing necessities to affected families");
                System.out.println("");
                System.out.println("these are some NGOs");
                System.out.println("1)Hindrise \n2)IRC foundation \nplease enter ur choise");
                int x13 = sc.nextInt();

                switch (x13) {
                    case 1:
                        System.out.println("NGO1:");
                        System.out.println("Hindrise Foundation");
                        System.out.println("Address:12 Siddhivinayak aashram,near ADAJAN,surat");
                        System.out.println("Contact No:789564003");
                        System.out.println("Hindrise178@gmail.com");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("IRC Foundation");
                        System.out.println("Address:187 Siddhivinayak aashram,rameshwarnagar ,near Adajan,surat");
                        System.out.println("Contact No:87965407892");
                        System.out.println("irc112@gmail.com");
                        break;

                }
                break;
            case 2:
                System.out.println("SERVICE ORIENTTED NGOs:which campaign dedicatedly towards the promotion and awareness of education, health, family planning for the underprivileged section of the society.");
                System.out.println();
                System.out.println("these are some NGOs");
                System.out.println("1)Muskan Foundation	\n2)HEART Foundation		 \nplease enter ur choise");
                int x14 = sc.nextInt();

                switch (x14) {
                    case 1:
                        System.out.println("\tNGO Name       : Muskan Foundation ");
                        System.out.println("\tContact Number : 9875232150");
                        System.out.println("\tEmail          : muskfon01@gmail.com ");
                        System.out.println("\tAddress        : A-304 Rameshwar Society, Nr. Maple Trade Centre, Bhaili");
                        break;
                    case 2:
                        System.out.println("\tNGO Name       : HEART Foundation ");
                        System.out.println("\tContact Number : 9875236659");
                        System.out.println("\tEmail          : heart32@gmail.com ");
                        System.out.println("\tAddress        : 201, Besides Smit Appartment, Manajalpur");
                        break;
                }
                break;

            case 3:
                System.out.println("NGOs Participatory approach is employed and is signified by self-help missions and plans in which localities play a primary role by engagement with the organization of a project");
                System.out.println("They organize, manage in every possible way by themselves, they collect donations in terms of money, land, tools, labour, material, etc.");
                System.out.println();
                System.out.println("these are some NGOs");
                System.out.println("1)smile Foundation\n2)sahay foundation       \nplease enter ur choise");
                int x15 = sc.nextInt();

                switch (x15) {
                    case 1:
                        System.out.println("NGO1:");
                        System.out.println("Smile Foundation");
                        System.out.println("Address:12 Siddhivinayak aashram,near ADAJAN,surat");
                        System.out.println("Contact No:789564003");
                        System.out.println("Smile178@gmail.com");
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("NGO2:");
                        System.out.println("Sahay foundation");
                        System.out.println("Address:B149 pramukh arcade,,near Adajan,surat");
                        System.out.println("Contact No:8745298402");
                        System.out.println("Sahay0foundation1345@gmail.com");
                        System.out.println();
                        break;
                }
                break;

            case 4:
                System.out.println(" NGOs fall under this category, with emphasis upon Empowering Orientation.");
                System.out.println("Their aim is to provide aids to the deprived section and nurture the understanding of the social, political & economic aspects affecting their lives.");
                System.out.println("");
                System.out.println("these are some NGOs");
                System.out.println("1)CARE India \n2)Shikshan Ane Samaj Kalyan Kendra \nplease enter ur choise");
                int x16 = sc.nextInt();

                switch (x16) {
                    case 1:
                        System.out.println("\tNGO Name       : CARE India");
                        System.out.println("\tContact Number : 9875236140");
                        System.out.println("\tEmail          : CAREIndia02@gmail.com ");
                        System.out.println("\tAddress        : 301 Surya Complex, Nr. HP Petrol Pump, Bopal");
                        break;
                    case 2:
                        System.out.println("\tNGO Name       :Shikshan Ane Samaj Kalyan Kendra ");
                        System.out.println("\tContact Number : 9875252040");
                        System.out.println("\tEmail          : vision62@gmail.com ");
                        System.out.println("\tAddress        : B-211 Rudra Arcade, Nr. Tapovan Circle, Motera");
                        break;
                }
                break;
        }
    }
    void FindNgoNearYourArea() {
        System.out.println("Select Appropiate Number According To Your Prefrencess");

        System.out.println("1.AHMEDABAD\n2.SURAT\n3.GADHINAGAR\n4.VADODARA\n5.NADIAD");
        int GCity = sc.nextInt();
        switch (GCity) {
            case 1: {
                System.out.println("1.BOPAL\n2.MOTERA\n3.MANINAGAR\n4.NARODA\n5.PALDI");
                int Ahm_Area = sc.nextInt();
                switch (Ahm_Area) {
                    case 1:
                        System.out.println("\tNGO Name       : Invincible ");
                        System.out.println("\tContact Number : 9875236140");
                        System.out.println("\tEmail          : invincible02@gmail.com ");
                        System.out.println("\tAddress        : 301 Surya Complex, Nr. HP Petrol Pump, Bopal");
                        break;
                    case 2:
                        System.out.println("\tNGO Name       : A V Vision Foundation ");
                        System.out.println("\tContact Number : 9875252040");
                        System.out.println("\tEmail          : vision62@gmail.com ");
                        System.out.println("\tAddress        : B-211 Rudra Arcade, Nr. Tapovan Circle, Motera");
                        break;
                    case 3:
                        System.out.println("\tNGO Name       : 4Leg Rescue Foundation ");
                        System.out.println("\tContact Number : 9875236521");
                        System.out.println("\tEmail          : resuceleg32@gmail.com ");
                        System.out.println("\tAddress        : C-314 Giriraj Complex, Nr. Balaji Hall, Maninagar");
                        break;
                    case 4:
                        System.out.println("\tNGO Name       : Aadhar Foundation ");
                        System.out.println("\tContact Number : 9876542340");
                        System.out.println("\tEmail          : aadhar856@gmail.com ");
                        System.out.println("\tAddress        : 41 Janpath Complex, Nr. Asopalav Showroom, Naroda");
                        break;
                    case 5:
                        System.out.println("\tNGO Name       : Aadesh Foundation ");
                        System.out.println("\tContact Number : 9875653140");
                        System.out.println("\tEmail          : aadesh.$.02@gmail.com ");
                        System.out.println("\tAddress        : 602 Gokuldharm Appartment, Opp. Yash Plaza, Paldi");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            }
            case 2:{
                System.out.println("1.ADAJAN\n2.UDAHANA\n3.KATARGAM");
                int Sur_Area = sc.nextInt();
                switch (Sur_Area) {
                    case 1:
                        System.out.println("NGO1:");
                        System.out.println("Smile Foundation");
                        System.out.println("Address:12 Siddhivinayak aashram,near ADAJAN,surat");
                        System.out.println("Contact No:789564003");
                        System.out.println("Smile178@gmail.com");
                        System.out.println();
                        System.out.println("NGO2:");
                        System.out.println("Sahay foundation");
                        System.out.println("Address:B149 pramukh arcade,,near Adajan,surat");
                        System.out.println("Contact No:8745298402");
                        System.out.println("Sahay0foundation1345@gmail.com");
                        System.out.println();
                        System.out.println("NGO3:");
                        System.out.println("VS foundation");
                        System.out.println("Address:15 priya pujan flats,,near Adajan,surat");
                        System.out.println("Contact No:9997767230");
                        System.out.println("VSfoundation@gmail.com");
                        System.out.println("");
                        System.out.println("NGO4:");
                        System.out.println("IRC Foundation");
                        System.out.println("Address:187 Siddhivinayak aashram,rameshwarnagar ,near Adajan,surat");
                        System.out.println("Contact No:87965407892");
                        System.out.println("irc112@gmail.com");

                    case 2:
                        System.out.println("NO DATA FOUND");
                        break;

                    case 3:
                        System.out.println("NGO1:");
                        System.out.println("pashv Foundation");
                        System.out.println("Adress:12 Siddhivinayak aashram,near katargam,surat");
                        System.out.println("Conatact No:8745987230");
                        System.out.println("P12378@gmail.com");
                        System.out.println();
                        System.out.println("NGO2:");
                        System.out.println(" Maitry foundation");
                        System.out.println("Adress:B14 ved arcade,,near katargam,surat");
                        System.out.println("Conatact No:8745298402");
                        System.out.println("Maitry15@gmail.com");
                        System.out.println();
                        System.out.println("NGO3:");
                        System.out.println("Yash foundation");
                        System.out.println("Adress:1456 RK ACRADE,,near katargam,surat");
                        System.out.println("Conatact No:7812620030");
                        System.out.println("Yashfoundation@gmail.com");
                        System.out.println("");

                    default:
                        System.out.println("invalid input");
                }
                        break;
            }

            case 3:{
                System.out.println("1.SECTOR 1(Pathika)\n2.SECTOR 11\n3.SECTOR 13(Mahatma Mandir)\n4.SECTOR 10(Sachivalay)");
                int GN_Area = sc.nextInt();
                switch (GN_Area) {
                    case 1:
                        System.out.println("NGO1:");
                        System.out.println("Aatamnivedan Foundation");
                        System.out.println("Adress:12 Siddhivinayak aashram,near pathik aashram ,gadhinagar");
                        System.out.println("Conatact No:8745987230");
                        System.out.println("Aatamnivedan12@gmail.com");
                        System.out.println();
                        System.out.println("NGO2:");
                        System.out.println("AAYAM foundation");
                        System.out.println("Adress:B149 pramukh arcade,,near pathik aashram ,gadhinagar");
                        System.out.println("Conatact No:8745298402");
                        System.out.println("aayamfoundation1345@gmail.com");
                        System.out.println();
                        System.out.println("NGO3:");
                        System.out.println("Avkaar foundation");
                        System.out.println("Adress:15 priya pujan flats,,near pathik aashram  ,gadhinagar");
                        System.out.println("Conatact No:9997767230");
                        System.out.println("avkaarfoundation@gmail.com");
                        System.out.println("");
                        System.out.println("NGO4:");
                        System.out.println("Takshavi Foundation");
                        System.out.println("Adress:187 Siddhivinayak aashram,rameshwarnagar ,near pathik aashram ,gadhinagar");
                        System.out.println("Conatact No:789220321");
                        System.out.println("Takshavi112@gmail.com");

                    case 2:
                        System.out.println("NO DATA FOUND");
                        break;
                    case 3:
                        System.out.println("NGO1:");
                        System.out.println("Smit Foundation");
                        System.out.println("Adress:12 Siddhivinayak aashram,near mahatma Mandir,gadhinagar");
                        System.out.println("Conatact No:8745987230");
                        System.out.println("Smitp12@gmail.com");
                        System.out.println();
                        System.out.println("NGO2:");
                        System.out.println("Pratik foundation");
                        System.out.println("Adress:B14 ved arcade,near mahatmamandir,gadhinagar");
                        System.out.println("Conatact No:8745298402");
                        System.out.println("pratik15@gmail.com");
                        System.out.println();
                        System.out.println("NGO3:");
                        System.out.println("Riya foundation");
                        System.out.println("Adress:1456 RK ACRADE, near Mahatmamadir,gadhinagar");
                        System.out.println("Conatact No:7812620030");
                        System.out.println("Riyafoundation@gmail.com");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("NGO1:");
                        System.out.println("Aadarsh Foundation");
                        System.out.println("Adress:12 Siddhivinayak aashram,near sachivalay,gadhinagar");
                        System.out.println("Conatact No:8745987230");
                        System.out.println("Adarsh7p8@gmail.com");
                        System.out.println();
                        System.out.println("NGO2:");
                        System.out.println("AIC foundation");
                        System.out.println("Adress:B14 ved arcade,near sachivalay,gadhinagar");
                        System.out.println("Conatact No:8745298402");
                        System.out.println("AIC15@gmail.com");
                        System.out.println();
                        System.out.println("NGO3:");
                        System.out.println("Ruchita foundation");
                        System.out.println("Adress:1456 RK ACRADE, near sachivalay,gadhinagar");
                        System.out.println("Conatact No:7812620030");
                        System.out.println("Ruchitafoundation@gmail.com");
                        System.out.println("");

                    default:
                        System.out.println("invalid input");
                        break;
                }
                break;
            }
            case 4:{
                System.out.println("1.Bhaili\n2.Manajalpur\n3.Waghodia");
                int V_Area = sc.nextInt();
                switch (V_Area) {
                    case 1:
                        System.out.println("\tNGO Name       : Muskan Foundation ");
                        System.out.println("\tContact Number : 9875232150");
                        System.out.println("\tEmail          : muskfon01@gmail.com ");
                        System.out.println("\tAddress        : A-304 Rameshwar Society, Nr. Maple Trade Centre, Bhaili");
                    case 2:
                        System.out.println("\tNGO Name       : Smile Foundation ");
                        System.out.println("\tContact Number : 9875236659");
                        System.out.println("\tEmail          : smile32@gmail.com ");
                        System.out.println("\tAddress        : 201, Besides Smit Appartment, Manajalpur");
                        break;
                    case 3:
                        System.out.println("\tNGO Name       : Tims Foundation ");
                        System.out.println("\tContact Number : 9253146523");
                        System.out.println("\tEmail          : tims32.@gmail.com ");
                        System.out.println("\tAddress        : D-403 Narayan Exotica, Nr. Sunflower Hospital, Waghodia");
                        break;
                    default:
                        System.out.println("invalid input");
                        break;
                }
                break;
            }
            case 5:{
                System.out.println("NGOs in Nadiad");
                break;
            }
        }
    }
}
class vol extends member{
    int vol_id;
    String name,email;
    static int i=0;
    Scanner sc=new Scanner(System.in);
    void vol_login(vol A[]){
        System.out.print("Name: ");
        A[i].name=sc.nextLine();
        boolean flagk=true;
        while(flagk) {
            System.out.print("Phone number: ");
            A[i].ph_no = sc.nextLong();
            long temp = ph_no;
            int count = 1;
            while (temp > 10) {
                temp = temp / 10;
                count++;
            }
            if(count==10){
                flagk=false;
            }
            else{
                continue;
            }
        }
       
        System.out.print("Email: ");
		sc.nextLine();
        A[i].email=sc.nextLine();
        System.out.print("City:");
        A[i].city=sc.next();
        System.out.print("Thank you for joining us.\nYour new volunteer account has been successfully created.");
                i++;
    }
    void ModifyData(vol A1[]){

        int k=0;
        System.out.println("Which Data You Want To Modify");
        System.out.print("1.NGO_name 2.CITY 3.PHONE NUMBER 4.EMAIL ");
        int CHOICE=sc.nextInt();
        switch(CHOICE){
            case 1:
                System.out.print("Name: ");
				sc.nextLine();
                A1[k].name=sc.nextLine();
                
                break;
            case 2:
                System.out.print("City:");
                A1[k].city=sc.next();
                break;
            case 3:
                boolean flagk=true;
                while(flagk) {
                    System.out.print("Phone number: ");
                    A1[k].ph_no = sc.nextLong();
                    long temp = ph_no;
                    int count = 1;
                    while (temp > 10) {
                        temp = temp / 10;
                        count++;
                    }
                    if(count==10){
                        flagk=false;
                    }
                    else{
                        continue;
                    }
                }
               
                break;
            case 4:
                System.out.print("Email: ");
				sc.nextLine();
                A1[k].email=sc.nextLine();
                break;
            default:
                System.out.println("Please Enter Valid Choice");
                CHOICE=sc.nextInt();
                ModifyData(A1);
                break;
        }
        System.out.println("Do You Want TO Dispaly Modify Data?\nYES/NO");

        String Response=sc.next();
        if(Response.equalsIgnoreCase("Yes")){
            System.out.println(A1[k].name+"\n "+A1[k].city+"\n "+A1[k].ph_no+"\n "+A1[k].email);

            System.out.println("Do You Want TO Modify Another Data?\nYES/NO");
            boolean flagp=true;
            String Response1;
            while(flagp)
            {
                Response1=sc.next();
                if(Response1.equalsIgnoreCase("yes")||Response1.equalsIgnoreCase("no"))
                {
                    flagp=false;
                    if(Response1.equalsIgnoreCase("Yes")){
                        ModifyData(A1);
                    }
                }
                else
                {
                    System.out.print("Please Enter Valid Input=");
                }
            }
        }
        else{
            System.out.println("Do You Want TO  Modify it again ?\nYES/NO");

            String Response1=sc.next();
            if(Response1.equalsIgnoreCase("Yes")){
                ModifyData(A1);
            }
        }
    }
    int check,amt;
    String aadhar;
    void aadhar_veri(){
        System.out.print("Enter Aadhar number[must 12 digit]: ");
        aadhar=sc.next();
        if(aadhar.length()==12){
            System.out.println("Aadhar Verified ");
            return;
        }
        else{
            System.out.println("Invalid Aadhar Number..please enter again");
            aadhar_veri();
        }
    }
    void donate(NGOr n[],int k){
        n[0].display(n,k);
        System.out.print("Activity you want to donate in (Sr. no.): ");
        int i=sc.nextInt();
        System.out.println("NGO: "+n[i-1].NGO_name);
        System.out.println("Activity: "+n[i-1].Act);
        System.out.println("City: "+n[i-1].City);
        System.out.println("Required Funds: "+n[i-1].fund_req);
        System.out.println("Raised Funds: "+n[i-1].fund_raised);
        System.out.println();
        aadhar_veri();
        System.out.print("Enter amount you want to donate: ");
        amt=sc.nextInt();
        n[i-1].fund_raised=n[i-1].fund_raised+amt;
    }
}

class admin extends member{
    int ad_id;
    static int i=0;
    void admin_login(admin A1[]){
        System.out.print("Name: ");
        A1[i].name=sc.nextLine();
        System.out.print("City:");
        A1[i].city=sc.next();
        boolean flagk=true;
        while(flagk) {
            System.out.print("Phone number: ");
            A1[i].ph_no = sc.nextLong();
            long temp = ph_no;
            int count = 1;
            while (temp > 10) {
                temp = temp / 10;
                count++;
            }
            if(count==10){
                flagk=false;
            }
            else{
                continue;
            }
        }
        
        System.out.print("Email: ");
		sc.nextLine();
        A1[i].email=sc.nextLine();
        System.out.print("Thank you for joining us.\nYour NGO account has been successfully created.");
                i++;
    }
    void AddActivity(NGOr n){
//int i=0;
        System.out.println("enter your NGO and activity details:");
        n.Add();
//i++;
    }
    void ModifyData(admin A1[]){

        System.out.print("For Which User You Want To Modify");
        int k=0;
        System.out.println("Which Data You Want To Modify");
        System.out.print("1.NGO_name 2.CITY 3.PHONE NUMBER 4. EMAIL ");

        int CHOICE=sc.nextInt();
        switch(CHOICE){
              case 1:
                System.out.print("Name: ");
				sc.nextLine();
                A1[k].name=sc.nextLine();
                
                break;
            case 2:
                System.out.print("City:");
                A1[k].city=sc.next();
                break;
            case 3:
                boolean flagk=true;
                while(flagk) {
                    System.out.print("Phone number: ");
                    A1[k].ph_no = sc.nextLong();
                    long temp = ph_no;
                    int count = 1;
                    while (temp > 10) {
                        temp = temp / 10;
                        count++;
                    }
                    if(count==10){
                        flagk=false;
                    }
                    else{
                        continue;
                    }
                }
               
                break;
            case 4:
                System.out.print("Email: ");
				sc.nextLine();
                A1[k].email=sc.nextLine();
                break;
            default:
                System.out.println("Please Enter Valid Choice");
                CHOICE=sc.nextInt();
                ModifyData(A1);
                break;
            
        }
        System.out.println("Do You Want TO Dispaly Modify Data?\nYES/NO");
        String Response=sc.next();
        if(Response.equalsIgnoreCase("Yes")){
            System.out.println(A1[k].name+" "+A1[k].city+" "+A1[k].ph_no+" "+A1[k].email);
            System.out.println("Do You Want TO Modify Data Again?\nYES/NO");
            String Response1="";
            boolean flagp12=true;
            while(flagp12)
            {
                Response1=sc.next();
                if(Response1.equalsIgnoreCase("yes")||Response1.equalsIgnoreCase("no"))
                {
                    flagp12=false;

                }
                else
                {
                    System.out.print("Please Enter Valid Input=");
                }}

            if(Response1.equalsIgnoreCase("Yes")){
                ModifyData(A1);
            }
        }
        else{
            System.out.println("Do You Want TO Modify Data For Another User?\nYES/NO");

            String Response1=sc.next();
            if(Response1.equalsIgnoreCase("Yes")){
                ModifyData(A1);
            }
        }
    }
}
class ngoi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        vol A[]=new vol[5];
        admin A1[]=new admin[5];
        NGOr n[]=new NGOr[10];
        for(int i=0;i<10;i++){
            n[i]=new NGOr();
        }
        // 5 NGO records from our side
        // 1
        n[0].sr_no=1;
        n[0].NGO_name="Avkaar foundation";
        n[0].Act="For providing clothes and blankets to the unprivileged";
        n[0].City="Gandhinagar";
        n[0].fund_raised=3700;
        n[0].fund_req=30000;
        //2
        n[1].sr_no=2;
        n[1].NGO_name="Takshavi Foundation";
        n[1].Act="Providing for stationary and school uniform for orphans";
        n[1].City="Gandhinagar";
        n[1].fund_raised=5200;
        n[1].fund_req=35000;
        //3
        n[2].sr_no=3;
        n[2].NGO_name="IRC foundation ";
        n[2].Act="Construction of shelters for homeless families";
        n[2].City="Surat";
        n[2].fund_raised=57000;
        n[2].fund_req=560000;
        //4
        n[3].sr_no=4;
        n[3].NGO_name="4leg rescue Foundation" ;
        n[3].Act="Treating and providing shelter to stray animals";
        n[3].City="Ahmedabad";
        n[3].fund_raised=32000;
        n[3].fund_req=45000;
        //5
        n[4].sr_no=5;
        n[4].NGO_name="Tims Foundation";
        n[4].Act="Helping Farmers affected by drought in northern Gujarat";
        n[4].City="Vadodra";
        n[4].fund_raised=120000;
        n[4].fund_req=250000;
        //6
        n[5].sr_no=6;
        n[5].NGO_name="Nadiadi NGO";
        n[5].Act="Providing Primary healthcare to remote villages of Kheda";
        n[5].City="Nadiad";
        n[5].fund_raised=52000;
        n[5].fund_req=95000;
        for(int i=0;i<A.length;i++){
            A[i]=new vol();
            A1[i]=new admin();
        }

        System.out.println("\t\t\t\t********************** Welcome to SAHAY-The Digital NGO ********************** ");
        System.out.println("Sahay is a one stop for all who wants to become a part of something good by giving we provides interface between NGO and volunteer.\nIt works on the principle of the\"helping\" so let's begin your Journey to make someone's life just a little better day by day...!");
        System.out.println();
        System.out.println("1)Login as Volunteer\n2)Login as Admin\n3)Contact us");
        NGOr n1=new NGOr();
        int c=sc.nextInt();
        int i=0;
        int k=6;
        switch(c){
            case 1: 
                A[i].vol_login(A);
                boolean flag1 = true;
                while (flag1) {
                    System.out.println("Press Number According to your prefrences:");
                    System.out.println("1)Find NGO\n2)Donate funds\n3)Display NGO list\n4)Take a look at our accomplishments\n5)ModifyData\n6)Logout");
                    int q = sc.nextInt();
                    switch (q) {
                        case 1: {
                            System.out.println("Searh by:\n1)Type of NGO\n2)NGO near your area");
                            int x1=sc.nextInt();
                            switch(x1){
                                case 1:{
                                    A[i].find_wrt_type();
                                break;
                                }
                                case 2:{
                                    A[i].FindNgoNearYourArea();
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            A[i].donate(n,k);
                            break;
                        }
                        case 3:{
                            n1.display(n,k);
                            break;
                        }
                        case 4:{
                            System.out.println("1)Invest in childhood (2018):");
                            System.out.println(" >Providing two full meals to over 2500 orphan children.\n>with te help of over 200+ donors. ");
                            System.out.println(" 2)providing Stationery (2018):");
                            System.out.println(" >Providing stationery to over 100000 orphan children.\n>with te help of over 2000+ donors. ");
                            System.out.println("3>got best ngo management system award(2020)");
                            System.out.println("4>hounered by pm (2021)");
                            break;
                        }
                        case 5: {
                            A[i].ModifyData(A);
                            break;
                        }
                        case 6:{
                            System.out.println("A feedback would be really helpful.Fill feedback form yes/no?");
                            String feed1="";
						
							boolean flag112=true;
				while(flag112)
				{
				feed1=sc.next();
				if(feed1.equalsIgnoreCase("yes")||feed1.equalsIgnoreCase("no"))
				{
                flag112=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                            if(feed1.equalsIgnoreCase("Yes")){
                                System.out.println("Feedback form!");
                                System.out.print("Please enter your name: ");
                                sc.nextLine();
                                sc.nextLine();
                                System.out.print("Please rate our NGO's services (1-5) : ");
                                sc.nextInt();
                                System.out.print("Please provide any additional feedback: ");
                                sc.next();
                                System.out.println("Thank you for your feedback..!Hope To See You Again");
                                System.out.println("\t\t\t\t\"we make a living by what we get but we make a life by what we give\"\t");
                            }
                            flag1=false;
                            break;
                        }
                    }
                
                break;
            }
            case 2:                A1[i].admin_login(A1);
                boolean flag2=true;
                while(flag2){
                    System.out.println("Press Number According to your prefrences:");
                    System.out.println("1)Add Activity for your Ngo\n2)Display NGO list\n3)ModifyData\n4)logout");
                    int j=sc.nextInt();
                    switch(j){
                        case 1:
                            A1[i].AddActivity(n[k]);
                            k++;
                            break;
                        case 2:
                            n1.display(n,k);
                            break;
                        case 3:
                            A1[i].ModifyData(A1);
                            break;
                        case 4:
                            System.out.println("Thank you for choosing us..!");
                            System.out.println("A feedback would be really helpful.Fill feedback form YES/NO?");
                            String feed2="";
							boolean flag11=true;
				while(flag11)
				{
				feed2=sc.next();
				if(feed2.equalsIgnoreCase("yes")||feed2.equalsIgnoreCase("no"))
				{
                flag11=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                            if(feed2.equalsIgnoreCase("Yes")){
                                System.out.println("Feedback form!");
                                System.out.print("Please enter your name: ");
                                sc.nextLine();
                                sc.nextLine();
                                System.out.print("Please rate our NGO's services (1-5) : ");
                                sc.nextInt();
                                System.out.print("Please provide any additional feedback: ");
                                sc.next();
                                System.out.println("Thank you for your feedback ..!Hope To See You Again");
                                System.out.println("\t\t\t\t\"we make a living by what we get but we make a life by what we give\"\t");
                            }
                            flag2=false;
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                }
                break;
            
            case 3:
			
                System.out.println("\tYou can contact us at below given Contact Number and Address : ");
                System.out.println("Contact Number : 9313281928");
                System.out.println("Email : sahay.32#@gmail.com");
                System.out.println("Address : Mumta Appartment, Nr. Sanand Circle, Sarkhej");
                break;
        }
    }
}




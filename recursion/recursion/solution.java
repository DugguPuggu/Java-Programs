class QATeamInfo{

    // Data members//
    
    String name;
    String projectName;
    String mobile;
    int age;
    int empId;
    
    //Member function//
    
    void showQATeamInfo(){
    
    System.out.println("Name of QA:"+name);
    System.out.println("Id of QA:"+empId);
    System.out.println("Mobile of QA:"+mobile);
    System.out.println("age of QA:"+age);
    
    
    }
    
    void dailyReport(){
    
    
    }
    }
public class solution{
    public static void main(String[] args) {

        QATeamInfo q = new QATeamInfo();

        q.showQATeamInfo();


    }
}
    

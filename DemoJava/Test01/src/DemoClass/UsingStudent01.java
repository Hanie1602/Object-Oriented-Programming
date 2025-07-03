package Democlass;

public class UsingStudent01 {

    public static void main(String[] args) {
      /* student sv1 = new student("SE172079" , "Nguyen Tuan Kiet" , "SE" , "08/02/2003","7.5f");      
       student sv2 = new student("SE172079" , "Nguyen Tuan Khoi" , "SE" , "03/02/2003","6.5f");          
       student sv3 = new student("SE172079" , "Nguyen Tuan Kien" , "SE" , "17/02/2003","9.5f");      
       student sv4 = new student("SE172079" , "Nguyen Tuan Khang" , "SE" , "14/02/2003","5.5f");
      */
       Student[] listst=new Student[4];
       listst[0]=new Student("SE172079" , "Nguyen Tuan Kiet" , "SE" , "08/02/2003","9.5f");
       
       listst[1]=new Student("SE172079" , "Nguyen Tuan Khoi" , "SE" , "03/02/2003","8.5f"); 
       
       listst[2]=new Student("SE172079" , "Nguyen Tuan Kien" , "SE" , "08/02/2003","7.5f");
       
       listst[3]=new Student("SE172079" , "Nguyen Tuan Khang" , "SE" , "03/02/2003","6.5f"); 
       
        for(int i=0;i<listst.length;i++){
            listst[i].viewinfo();
        }
        
    }

}

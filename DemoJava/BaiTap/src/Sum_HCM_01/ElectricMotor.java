package Sum_HCM_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trinhdinhngocan
 */
public class ElectricMotor {
    private String name;
    private int voltage;
    private int current;

    public ElectricMotor() {
    }

    public ElectricMotor(String name, int voltage, int current) {
        this.name = name;
        this.voltage = voltage;
        this.current = current;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoltage() {
        return voltage;
    }

    //voltage update. Valid values are between 110 and 220. If it is out of range, print out "Invalid value"
    public void setVoltage(int voltage) {
        if(voltage >= 110 && voltage <= 220){
            this.voltage = voltage;
        }
        System.out.println("Invalid value");
    }

    public int getCurrent() {
        return current;
    }

    //current update. Valid value is greater than 0. If value is less than or equal to 0. print out "Invalid value"
    public void setCurrent(int current) {
        if (current > 0) {
            this.current = current;
        } else {
            System.out.println("Invalid value");
        }
    }
    
    //returns the motor power calculated as voltage times current
    //trả về công suất động cơ được tính bằng điện áp nhân với dòng điện
    public int getPower(){
        return current*voltage;
    }
}


//TEST:
//toshiba       220     2       Enter: 2                Out: 440
//toshiba       220     2       Enter: 3        300     Out: Invalid value
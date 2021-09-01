package org.atomic.coder.design_pattern._2_structuralpattern._5_Facade_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 18:02
 * <p>
 * 跑腿的人
 */
public class RunnerFacade {

    DrugstoreDepartment drugstoreDepartment = new DrugstoreDepartment();
    InternalDepartment internalDepartment = new InternalDepartment();
    OutpatientDepartment outpatientDepartment = new OutpatientDepartment();

    public void takePill() {
        System.out.print("告诉跑腿的人，");
        drugstoreDepartment.takePill();
    }

    public void doctorLook() {
        System.out.print("告诉跑腿的人，");
        internalDepartment.doctorLook();
    }

    public void getTicket() {
        System.out.print("告诉跑腿的人，");
        outpatientDepartment.getTicket();
    }

    public void pay() {
        System.out.print("告诉跑腿的人，");
        outpatientDepartment.pay();
    }

}

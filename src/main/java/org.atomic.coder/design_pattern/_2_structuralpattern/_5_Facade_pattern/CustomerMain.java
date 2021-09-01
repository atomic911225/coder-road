package org.atomic.coder.design_pattern._2_structuralpattern._5_Facade_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 18:10
 */
public class CustomerMain {

    public static void main(String[] args) {
        System.out.println("模拟一个人去医院看病的过程");
        OutpatientDepartment outpatientDepartment = new OutpatientDepartment();
        outpatientDepartment.getTicket();
        InternalDepartment internalDepartment = new InternalDepartment();
        internalDepartment.doctorLook();
        outpatientDepartment.pay();
        DrugstoreDepartment drugstoreDepartment = new DrugstoreDepartment();
        drugstoreDepartment.takePill();

        System.out.println();
        System.out.println("有跑腿的人");
        RunnerFacade runnerFacade = new RunnerFacade();
        runnerFacade.getTicket();
        runnerFacade.doctorLook();
        runnerFacade.pay();
        runnerFacade.takePill();

    }

}

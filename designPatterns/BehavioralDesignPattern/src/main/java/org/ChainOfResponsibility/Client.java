package org.ChainOfResponsibility;

public class Client {

    public static void main(String[] args){
        Handler supportAgent = new SupportAgent();
        Handler supervisor = new Supervisor();
        Handler manager = new Manager();
        Handler director = new Director();

        supportAgent.setNext(supervisor);
        supervisor.setNext(manager);
        manager.setNext(director);

        Request technicalRequest = new Request("Technical", "Cannot login to account", 1);
        Request billingRequest = new Request("Billing", "Invoice discrepancy", 2);
        Request refundRequest = new Request("Refund", "Request for full refund", 4);

        System.out.println("Processing Technical Request");
        supportAgent.handleRequest(technicalRequest);
        System.out.println();

        System.out.println("Processing Billing Request");
        supportAgent.handleRequest(billingRequest);
        System.out.println();

        System.out.println("Processing Refund Request");
        supportAgent.handleRequest(refundRequest);
    }
}

/*
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each
 * handler decides either to process the request or to pass it to the next handler in the chain.
 *
 * Client can pass the request to any handler in the chain, no need to pass to the first handler everytime.
 *
 * Use this pattern, when you have to perform some steps sequentially.
 *
 */

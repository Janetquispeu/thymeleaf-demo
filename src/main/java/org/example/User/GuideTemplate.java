package org.example.User;

public class GuideTemplate {
    private String receptionCode;
    private Sender sender;
    private Receiver receiver;
    private String guideNumber;
    private Content content;
    private String deliveryCompany;

    // Constructor
    public GuideTemplate(String receptionCode, Sender sender, Receiver receiver, String guideNumber, Content content, String deliveryCompany) {
        this.receptionCode = receptionCode;
        this.sender = sender;
        this.receiver = receiver;
        this.guideNumber = guideNumber;
        this.content = content;
        this.deliveryCompany = deliveryCompany;
    }

    // Getters
    public String getReceptionCode() {
        return receptionCode;
    }

    public Sender getSender() {
        return sender;
    }

    public String getGuideNumber() {
        return guideNumber;
    }
    public Receiver getReceiver() {
        return receiver;
    }
    public Content getContent() {
        return content;
    }
    public String getDeliveryCompany() {
        return deliveryCompany;
    }
}

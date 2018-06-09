package com.blink.jtblc.client.bean;



/**
 * 交易信息
 */
public class Account {
    private String account;
    private Amount amount;
    private String destination;
    private String fee;
    private Long flags;
//    private List<String> memos; 返回值中没有，所以注释
    private Integer sequence;
    private String signingPubKey;
    private Integer timestamp;
    private String transactionType;
    private String txnSignature;
    private Integer date;
    private String hash;
    private Integer inLedger;
    private String ledgerIndex;
    private Meta meta;
    private Boolean validated;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Long getFlags() {
        return flags;
    }

    public void setFlags(Long flags) {
        this.flags = flags;
    }


    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getSigningPubKey() {
        return signingPubKey;
    }

    public void setSigningPubKey(String signingPubKey) {
        this.signingPubKey = signingPubKey;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTxnSignature() {
        return txnSignature;
    }

    public void setTxnSignature(String txnSignature) {
        this.txnSignature = txnSignature;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getInLedger() {
        return inLedger;
    }

    public void setInLedger(Integer inLedger) {
        this.inLedger = inLedger;
    }

    public String getLedgerIndex() {
        return ledgerIndex;
    }

    public void setLedgerIndex(String ledgerIndex) {
        this.ledgerIndex = ledgerIndex;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }
}



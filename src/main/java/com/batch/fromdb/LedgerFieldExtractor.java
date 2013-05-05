package com.batch.fromdb;

import org.springframework.batch.item.file.transform.FieldExtractor;
import com.batch.todb.Ledger;

/**
 * Created with IntelliJ IDEA.
 * User: TikuNibi
 * Date: 4/5/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class LedgerFieldExtractor implements FieldExtractor<Ledger> {

    public Object[] extract(Ledger ledger) {

        return new Object[]{
            ledger.getId(),
            ledger.getReceiptDate(),
            ledger.getMemberName(),
            ledger.getDepositAmount() + 5
        };  //To change body of implemented methods use File | Settings | File Templates.
    }
}

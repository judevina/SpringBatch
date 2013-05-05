package com.batch.fromdb;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.item.file.FlatFileFooterCallback;

import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * User: TikuNibi
 * Date: 4/5/13
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class LedgerFooterCallback extends StepExecutionListenerSupport implements FlatFileFooterCallback {

    private StepExecution stepExecution;

    @Override
    public void beforeStep(StepExecution stepExecution) {
        this.stepExecution = stepExecution;
    }

    public void writeFooter(Writer writer) throws IOException {

       // writer.write("# Write count:" + stepExecution.getWriteCount());
        if( null != stepExecution.getEndTime() ) {
            long delta = stepExecution.getEndTime().getTime()
                    - stepExecution.getStartTime().getTime();
            writer.write("# Done in: " + delta + " ms");
        }
    }
}

package net.somta.juggle.core.dispatcher.impl;

import net.somta.juggle.core.IWorkRunner;
import net.somta.juggle.core.RuntimeContext;
import net.somta.juggle.core.dispatcher.AbstractDispatcher;
import net.somta.juggle.core.enums.FlowStatusEnum;
import net.somta.juggle.core.executor.FlowExecutor;
import net.somta.juggle.core.model.FlowResult;

import java.util.Map;

public class SyncDispatcher extends AbstractDispatcher {

    private FlowExecutor flowExecutor;

    public SyncDispatcher() {
        super(null);
        flowExecutor = new FlowExecutor();
    }

    @Override
    protected FlowResult doSend(RuntimeContext runtimeContext) {
        Map<String,Object> data = flowExecutor.execute(runtimeContext);
        FlowResult flowResult = new FlowResult()
                .setStatus(FlowStatusEnum.FINISH)
                .setData(data);
        return flowResult;
    }
}
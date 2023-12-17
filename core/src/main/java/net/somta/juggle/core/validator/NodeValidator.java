package net.somta.juggle.core.validator;

import net.somta.juggle.core.enums.ElementTypeEnum;
import net.somta.juggle.core.model.node.FlowNode;

/**
 * @author husong
 */
public class NodeValidator {

    public void validateNode(FlowNode flowNode){
        IValidator validator = getElementValidator(flowNode.getElementType());
        if(validator != null){
            validator.validateFlow(flowNode);
        }
    }

    private IValidator getElementValidator(ElementTypeEnum flowElementType){
        switch (flowElementType) {
            case START: return new StartNodeValidator();
            case END: return new EndNodeValidator();
            case METHOD: return new MethodNodeValidator();
            case CONDITION: return new ConditionNodeValidator();
            default: return null;
        }
    }
}
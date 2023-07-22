package net.somta.juggle.console.application.service;

import net.somta.core.base.IBaseService;
import net.somta.juggle.console.infrastructure.model.FlowDefinitionInfo;
import net.somta.juggle.console.interfaces.param.FlowDefinitionPageParam;
import net.somta.juggle.console.interfaces.param.FlowDefinitionParam;
import net.somta.juggle.core.model.FlowDefinition;

import java.util.List;

public interface IFlowDefinitionService extends IBaseService<FlowDefinitionInfo> {

    /**
     * 创建流程
     * @param flowDefinitionParam
     * @return
     */
    Boolean addFlowDefinition(FlowDefinitionParam flowDefinitionParam);

    /**
     * 删除流程
     * @param flowDefinitionId
     * @return
     */
    Boolean deleteFlowDefinition(Long flowDefinitionId);

    /**
     * 修改流程定义
     * @param flowDefinitionParam
     * @return
     */
    Boolean updateFlowDefinition(FlowDefinitionParam flowDefinitionParam);

    /**
     *
     * @param flowDefinitionId
     * @return
     */
    FlowDefinitionInfo getFlowDefinitionById(Long flowDefinitionId);

    /**
     * 获取流程定义
     * @param flowKey
     * @return
     */
    FlowDefinition getFlowDefinitionByKey(String flowKey);

    /**
     * 查询流程列表
     * @param flowDefinitionPageParam
     * @return
     */
    List<FlowDefinitionInfo> getFlowDefinitionList(FlowDefinitionPageParam flowDefinitionPageParam);

    /**
     * 部署流程
     * @param flowDefinitionInfo
     * @return
     */
    Boolean deployFlowDefinition(FlowDefinitionInfo flowDefinitionInfo,String version);
}
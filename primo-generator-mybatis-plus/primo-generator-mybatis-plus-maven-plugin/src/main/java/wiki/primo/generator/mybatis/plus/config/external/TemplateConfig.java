package wiki.primo.generator.mybatis.plus.config.external;

import wiki.primo.generator.mybatis.plus.config.constant.ConstVal;
import org.apache.commons.lang.StringUtils;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * 模板路径配置项
 */
public class TemplateConfig {

    @Parameter(defaultValue = ConstVal.TEMPLATE_ENTITY)
    private String entity;

    @Parameter(defaultValue = ConstVal.TEMPLATE_REQ_ENTITY)
    private String entityReq;

    @Parameter(defaultValue = ConstVal.TEMPLATE_RESP_ENTITY)
    private String entityResp;

    @Parameter(defaultValue = ConstVal.TEMPLATE_SERVICE)
    private String service;

    @Parameter(defaultValue = ConstVal.TEMPLATE_SERVICEIMPL)
    private String serviceImpl;

    @Parameter(defaultValue = ConstVal.TEMPLATE_SERVICE_EXT)
    private String serviceExt;

    @Parameter(defaultValue = ConstVal.TEMPLATE_SERVICE_EXT_IMPL)
    private String serviceExtImpl;

    @Parameter(defaultValue = ConstVal.TEMPLATE_MAPPER)
    private String mapper;

    @Parameter(defaultValue = ConstVal.TEMPLATE_XML)
    private String xml;

    @Parameter(defaultValue = ConstVal.TEMPLATE_CONTROLLER)
    private String controller;

    @Parameter(defaultValue = ConstVal.QUERY_CONTROLLER)
    private String query;

    public String getQuery() {
        if(StringUtils.isEmpty(query)){
            return ConstVal.QUERY_CONTROLLER;
        }
        return query;
    }

    public String getEntity() {
        if (entity == null) return ConstVal.TEMPLATE_ENTITY;
        return entity;
    }

    public String getEntityReq() {
        if (entityReq == null) return ConstVal.TEMPLATE_REQ_ENTITY;
        return entityReq;
    }

    public String getEntityResp() {
        if (entityResp == null) return ConstVal.TEMPLATE_RESP_ENTITY;
        return entityResp;
    }

    public String getService() {
        if (service == null) return ConstVal.TEMPLATE_SERVICE;
        return service;
    }

    public String getServiceImpl() {
        if (serviceImpl == null) return ConstVal.TEMPLATE_SERVICEIMPL;
        return serviceImpl;
    }

    public String getMapper() {
        if (mapper == null) return ConstVal.TEMPLATE_MAPPER;
        return mapper;
    }

    public String getXml() {
        if (xml == null) return ConstVal.TEMPLATE_XML;
        return xml;
    }

    public String getController() {
        if (controller == null) return ConstVal.TEMPLATE_CONTROLLER;
        return controller;
    }

    public String getServiceExt() {
        if (serviceExt == null) return ConstVal.TEMPLATE_SERVICE_EXT;
        return serviceExt;
    }

    public String getServiceExtImpl() {
        if (serviceExtImpl == null) return ConstVal.TEMPLATE_SERVICE_EXT_IMPL;
        return serviceExtImpl;
    }
}

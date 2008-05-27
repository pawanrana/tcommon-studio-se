// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.dataprofiler.core;

import org.talend.commons.emf.FactoriesUtil;
import org.talend.dataprofiler.core.manager.DQStructureManager;

/**
 * This class store all the constant of current plugin.
 * 
 */
public final class PluginConstant {

    public static final String EMPTY_STRING = "";

    public static final String SPACE_STRING = " ";

    public static final String PROJECTCREATED_FLAG = "PROJECTCREATED_FLAG";

    public static final String CONNECTION_URL_PROPERTY = "CONNECTION_URL_PROPERTY";

    public static final String CONNECTION_DBNAME_PROPERTY = "CONNECTION_DBNAME_PROPERTY";

    public static final String PRV_SUFFIX = "." + FactoriesUtil.PROV;

    public static final String ANA_SUFFIX = "." + FactoriesUtil.ANA;

    public static final String REP_SUFFIX = "." + FactoriesUtil.REP;

    public static final String METADATA_PROJECTNAME = DQStructureManager.METADATA;

    public static final String DATA_PROFILING_PROJECTNAME = DQStructureManager.DATA_PROFILING;

    public static final String FILE_SUFFIX = "FILE_SUFFIX";

    public static final String ISDIRTY_PROPERTY = "ISDIRTY_PROPERTY";

    public static final String DATAFILTER_PROPERTY = "DATAFILTER_PROPERTY";

    public static final String REPORT_FOLDER_PATH = "/Data Profiling/Reports";

    public static final String DQ_VIEW_ID = "org.talend.dataprofiler.core.ui.views.DQRespositoryView";

    public static final String PARENTHESIS_LEFT = "(";

    public static final String PARENTHESIS_RIGHT = ")";
}

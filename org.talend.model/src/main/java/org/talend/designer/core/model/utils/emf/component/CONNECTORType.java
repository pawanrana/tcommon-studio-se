/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONNECTOR Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getBASESCHEMA <em>BASESCHEMA</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#isBUILTIN <em>BUILTIN</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getCOLOR <em>COLOR</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getCTYPE <em>CTYPE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getLINESTYLE <em>LINESTYLE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXINPUT <em>MAXINPUT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXOUTPUT <em>MAXOUTPUT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMININPUT <em>MININPUT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMINOUTPUT <em>MINOUTPUT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType()
 * @model extendedMetaData="name='CONNECTOR_._type' kind='empty'"
 * @generated
 */
public interface CONNECTORType extends EObject {
    /**
     * Returns the value of the '<em><b>BASESCHEMA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BASESCHEMA</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BASESCHEMA</em>' attribute.
     * @see #setBASESCHEMA(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_BASESCHEMA()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='BASE_SCHEMA' namespace='##targetNamespace'"
     * @generated
     */
    String getBASESCHEMA();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getBASESCHEMA <em>BASESCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BASESCHEMA</em>' attribute.
     * @see #getBASESCHEMA()
     * @generated
     */
    void setBASESCHEMA(String value);

    /**
     * Returns the value of the '<em><b>BUILTIN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BUILTIN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BUILTIN</em>' attribute.
     * @see #isSetBUILTIN()
     * @see #unsetBUILTIN()
     * @see #setBUILTIN(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_BUILTIN()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='BUILTIN' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBUILTIN();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#isBUILTIN <em>BUILTIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BUILTIN</em>' attribute.
     * @see #isSetBUILTIN()
     * @see #unsetBUILTIN()
     * @see #isBUILTIN()
     * @generated
     */
    void setBUILTIN(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#isBUILTIN <em>BUILTIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBUILTIN()
     * @see #isBUILTIN()
     * @see #setBUILTIN(boolean)
     * @generated
     */
    void unsetBUILTIN();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#isBUILTIN <em>BUILTIN</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BUILTIN</em>' attribute is set.
     * @see #unsetBUILTIN()
     * @see #isBUILTIN()
     * @see #setBUILTIN(boolean)
     * @generated
     */
    boolean isSetBUILTIN();

    /**
     * Returns the value of the '<em><b>COLOR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COLOR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COLOR</em>' attribute.
     * @see #setCOLOR(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_COLOR()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='COLOR' namespace='##targetNamespace'"
     * @generated
     */
    String getCOLOR();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getCOLOR <em>COLOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLOR</em>' attribute.
     * @see #getCOLOR()
     * @generated
     */
    void setCOLOR(String value);

    /**
     * Returns the value of the '<em><b>CTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CTYPE</em>' attribute.
     * @see #setCTYPE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_CTYPE()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='CTYPE' namespace='##targetNamespace'"
     * @generated
     */
    String getCTYPE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getCTYPE <em>CTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CTYPE</em>' attribute.
     * @see #getCTYPE()
     * @generated
     */
    void setCTYPE(String value);

    /**
     * Returns the value of the '<em><b>LINESTYLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LINESTYLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LINESTYLE</em>' attribute.
     * @see #isSetLINESTYLE()
     * @see #unsetLINESTYLE()
     * @see #setLINESTYLE(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_LINESTYLE()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='LINE_STYLE' namespace='##targetNamespace'"
     * @generated
     */
    int getLINESTYLE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getLINESTYLE <em>LINESTYLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LINESTYLE</em>' attribute.
     * @see #isSetLINESTYLE()
     * @see #unsetLINESTYLE()
     * @see #getLINESTYLE()
     * @generated
     */
    void setLINESTYLE(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getLINESTYLE <em>LINESTYLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLINESTYLE()
     * @see #getLINESTYLE()
     * @see #setLINESTYLE(int)
     * @generated
     */
    void unsetLINESTYLE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getLINESTYLE <em>LINESTYLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LINESTYLE</em>' attribute is set.
     * @see #unsetLINESTYLE()
     * @see #getLINESTYLE()
     * @see #setLINESTYLE(int)
     * @generated
     */
    boolean isSetLINESTYLE();

    /**
     * Returns the value of the '<em><b>MAXINPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAXINPUT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAXINPUT</em>' attribute.
     * @see #isSetMAXINPUT()
     * @see #unsetMAXINPUT()
     * @see #setMAXINPUT(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_MAXINPUT()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='MAX_INPUT' namespace='##targetNamespace'"
     * @generated
     */
    int getMAXINPUT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXINPUT <em>MAXINPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAXINPUT</em>' attribute.
     * @see #isSetMAXINPUT()
     * @see #unsetMAXINPUT()
     * @see #getMAXINPUT()
     * @generated
     */
    void setMAXINPUT(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXINPUT <em>MAXINPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMAXINPUT()
     * @see #getMAXINPUT()
     * @see #setMAXINPUT(int)
     * @generated
     */
    void unsetMAXINPUT();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXINPUT <em>MAXINPUT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MAXINPUT</em>' attribute is set.
     * @see #unsetMAXINPUT()
     * @see #getMAXINPUT()
     * @see #setMAXINPUT(int)
     * @generated
     */
    boolean isSetMAXINPUT();

    /**
     * Returns the value of the '<em><b>MAXOUTPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAXOUTPUT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAXOUTPUT</em>' attribute.
     * @see #isSetMAXOUTPUT()
     * @see #unsetMAXOUTPUT()
     * @see #setMAXOUTPUT(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_MAXOUTPUT()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='MAX_OUTPUT' namespace='##targetNamespace'"
     * @generated
     */
    int getMAXOUTPUT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXOUTPUT <em>MAXOUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAXOUTPUT</em>' attribute.
     * @see #isSetMAXOUTPUT()
     * @see #unsetMAXOUTPUT()
     * @see #getMAXOUTPUT()
     * @generated
     */
    void setMAXOUTPUT(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXOUTPUT <em>MAXOUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMAXOUTPUT()
     * @see #getMAXOUTPUT()
     * @see #setMAXOUTPUT(int)
     * @generated
     */
    void unsetMAXOUTPUT();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMAXOUTPUT <em>MAXOUTPUT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MAXOUTPUT</em>' attribute is set.
     * @see #unsetMAXOUTPUT()
     * @see #getMAXOUTPUT()
     * @see #setMAXOUTPUT(int)
     * @generated
     */
    boolean isSetMAXOUTPUT();

    /**
     * Returns the value of the '<em><b>MININPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MININPUT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MININPUT</em>' attribute.
     * @see #isSetMININPUT()
     * @see #unsetMININPUT()
     * @see #setMININPUT(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_MININPUT()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='MIN_INPUT' namespace='##targetNamespace'"
     * @generated
     */
    int getMININPUT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMININPUT <em>MININPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MININPUT</em>' attribute.
     * @see #isSetMININPUT()
     * @see #unsetMININPUT()
     * @see #getMININPUT()
     * @generated
     */
    void setMININPUT(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMININPUT <em>MININPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMININPUT()
     * @see #getMININPUT()
     * @see #setMININPUT(int)
     * @generated
     */
    void unsetMININPUT();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMININPUT <em>MININPUT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MININPUT</em>' attribute is set.
     * @see #unsetMININPUT()
     * @see #getMININPUT()
     * @see #setMININPUT(int)
     * @generated
     */
    boolean isSetMININPUT();

    /**
     * Returns the value of the '<em><b>MINOUTPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MINOUTPUT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MINOUTPUT</em>' attribute.
     * @see #isSetMINOUTPUT()
     * @see #unsetMINOUTPUT()
     * @see #setMINOUTPUT(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_MINOUTPUT()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='MIN_OUTPUT' namespace='##targetNamespace'"
     * @generated
     */
    int getMINOUTPUT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMINOUTPUT <em>MINOUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MINOUTPUT</em>' attribute.
     * @see #isSetMINOUTPUT()
     * @see #unsetMINOUTPUT()
     * @see #getMINOUTPUT()
     * @generated
     */
    void setMINOUTPUT(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMINOUTPUT <em>MINOUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMINOUTPUT()
     * @see #getMINOUTPUT()
     * @see #setMINOUTPUT(int)
     * @generated
     */
    void unsetMINOUTPUT();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getMINOUTPUT <em>MINOUTPUT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MINOUTPUT</em>' attribute is set.
     * @see #unsetMINOUTPUT()
     * @see #getMINOUTPUT()
     * @see #setMINOUTPUT(int)
     * @generated
     */
    boolean isSetMINOUTPUT();

    /**
     * Returns the value of the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAME</em>' attribute.
     * @see #setNAME(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORType_NAME()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getNAME();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CONNECTORType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(String value);

} // CONNECTORType
/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPastMedicalHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Past Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSPastMedicalHistorySectionImpl extends SectionImpl implements EMSPastMedicalHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPastMedicalHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPastMedicalHistorySectionHistoryOfCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionHistoryOfCondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfHistoryOfConditionOrSurgery getExistenceOfHistoryOfCondition() {
		return EMSPastMedicalHistorySectionOperations.getExistenceOfHistoryOfCondition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalSurgicalHistory getHistoryOfCondition() {
		return EMSPastMedicalHistorySectionOperations.getHistoryOfCondition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPastMedicalHistorySection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSPastMedicalHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSPastMedicalHistorySectionImpl

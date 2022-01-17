/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispatchSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Dispatch Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSDispatchSectionImpl extends SectionImpl implements EMSDispatchSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSDispatchSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_DISPATCH_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionEmergencyMedicalDispatchObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionEmergencyMedicalDispatchObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispatchSectionComplaintReportedByDispatch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionComplaintReportedByDispatch(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyMedicalDispatchObservation getEmergencyMedicalDispatchObservation() {
		return EMSDispatchSectionOperations.getEmergencyMedicalDispatchObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchReason getComplaintReportedByDispatch() {
		return EMSDispatchSectionOperations.getComplaintReportedByDispatch(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispatchSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSDispatchSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EMSDispatchSectionImpl

/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientEngagementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Engagement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientEngagementImpl extends ObservationImpl implements PatientEngagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientEngagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_ENGAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientEngagementTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientEngagementOperations.validatePatientEngagementTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientEngagementCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientEngagementOperations.validatePatientEngagementCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientEngagementCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientEngagementOperations.validatePatientEngagementCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientEngagementValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientEngagementOperations.validatePatientEngagementValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientEngagementValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientEngagementOperations.validatePatientEngagementValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientEngagement init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatientEngagement init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PatientEngagementImpl

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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicalSurgicalHistoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical Surgical History</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicalSurgicalHistoryImpl extends ObservationImpl implements MedicalSurgicalHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalSurgicalHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSurgicalHistoryNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalSurgicalHistory init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MedicalSurgicalHistory init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MedicalSurgicalHistoryImpl

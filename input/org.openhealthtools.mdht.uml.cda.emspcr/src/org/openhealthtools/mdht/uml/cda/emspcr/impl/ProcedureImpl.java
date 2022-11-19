/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureImpl extends org.eclipse.mdht.uml.cda.impl.ProcedureImpl implements Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAbandonedProcedureRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureAbandonedProcedureRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePriorRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedurePriorRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNumberOfAttemptsRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureNumberOfAttemptsRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSuccessfulRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureSuccessfulRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureComplicationsRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureComplicationsRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateProcedurePatientResponseRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedurePerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureAirwayConfirmationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureAirwayConfirmationRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureReasonProcedureNotAttemptedRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureReasonProcedureNotAttemptedRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureDeviceParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureDeviceParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Procedure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureImpl

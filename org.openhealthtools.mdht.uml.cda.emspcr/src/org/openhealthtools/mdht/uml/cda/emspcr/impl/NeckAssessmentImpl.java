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
import org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.NeckAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neck Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeckAssessmentImpl extends ObservationImpl implements NeckAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeckAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NECK_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeckAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeckAssessmentOperations.validateNeckAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeckAssessment init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NeckAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NeckAssessmentImpl

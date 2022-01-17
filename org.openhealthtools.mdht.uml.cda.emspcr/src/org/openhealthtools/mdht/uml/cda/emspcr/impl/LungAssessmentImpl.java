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
import org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.LungAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lung Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LungAssessmentImpl extends ObservationImpl implements LungAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LungAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.LUNG_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLungAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LungAssessmentOperations.validateLungAssessmentTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LungAssessment init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LungAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //LungAssessmentImpl

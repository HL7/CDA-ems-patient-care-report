/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ChestAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chest Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChestAssessmentImpl extends ObservationImpl implements ChestAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChestAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CHEST_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAssessmentTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAssessmentOperations.validateChestAssessmentTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChestAssessment init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ChestAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ChestAssessmentImpl

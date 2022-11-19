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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfHistoryOfConditionOrSurgeryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of History Of Condition Or Surgery</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExistenceOfHistoryOfConditionOrSurgeryImpl extends ObservationImpl
		implements ExistenceOfHistoryOfConditionOrSurgery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfHistoryOfConditionOrSurgeryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOrSurgeryOperations.validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOrSurgeryOperations.validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionOrSurgeryCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOrSurgeryOperations.validateExistenceOfHistoryOfConditionOrSurgeryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionOrSurgeryCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOrSurgeryOperations.validateExistenceOfHistoryOfConditionOrSurgeryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfConditionOrSurgeryValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfConditionOrSurgeryOperations.validateExistenceOfHistoryOfConditionOrSurgeryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfHistoryOfConditionOrSurgery init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExistenceOfHistoryOfConditionOrSurgery init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ExistenceOfHistoryOfConditionOrSurgeryImpl

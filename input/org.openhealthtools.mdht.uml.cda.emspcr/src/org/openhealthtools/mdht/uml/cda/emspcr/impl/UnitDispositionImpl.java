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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitDispositionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Disposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnitDispositionImpl extends ObservationImpl implements UnitDisposition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDispositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_DISPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDispositionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitDispositionOperations.validateUnitDispositionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDispositionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitDispositionOperations.validateUnitDispositionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDispositionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitDispositionOperations.validateUnitDispositionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDispositionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitDispositionOperations.validateUnitDispositionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDispositionValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitDispositionOperations.validateUnitDispositionValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDisposition init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UnitDisposition init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // UnitDispositionImpl

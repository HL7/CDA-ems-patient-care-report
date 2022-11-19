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
import org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.OxygenSaturationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oxygen Saturation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OxygenSaturationImpl extends ObservationImpl implements OxygenSaturation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OxygenSaturationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.OXYGEN_SATURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOxygenSaturationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OxygenSaturationOperations.validateOxygenSaturationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOxygenSaturationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OxygenSaturationOperations.validateOxygenSaturationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOxygenSaturationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OxygenSaturationOperations.validateOxygenSaturationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOxygenSaturationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OxygenSaturationOperations.validateOxygenSaturationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOxygenSaturationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OxygenSaturationOperations.validateOxygenSaturationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOxygenSaturationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OxygenSaturationOperations.validateOxygenSaturationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OxygenSaturation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OxygenSaturation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // OxygenSaturationImpl

/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.BodyTemperatureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BodyTemperatureImpl extends ObservationImpl implements BodyTemperature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.BODY_TEMPERATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyTemperatureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyTemperatureOperations.validateBodyTemperatureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyTemperatureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyTemperatureOperations.validateBodyTemperatureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyTemperatureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyTemperatureOperations.validateBodyTemperatureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyTemperatureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyTemperatureOperations.validateBodyTemperatureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyTemperatureValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyTemperatureOperations.validateBodyTemperatureValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyTemperature init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BodyTemperature init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //BodyTemperatureImpl

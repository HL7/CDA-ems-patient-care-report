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
import org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ReturnOfSpontaneousCirculationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Of Spontaneous Circulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReturnOfSpontaneousCirculationImpl extends ObservationImpl implements ReturnOfSpontaneousCirculation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnOfSpontaneousCirculationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RETURN_OF_SPONTANEOUS_CIRCULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOfSpontaneousCirculationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOfSpontaneousCirculationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOfSpontaneousCirculationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOfSpontaneousCirculationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOfSpontaneousCirculationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOfSpontaneousCirculationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnOfSpontaneousCirculation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReturnOfSpontaneousCirculation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ReturnOfSpontaneousCirculationImpl

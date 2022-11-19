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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitLeftSceneTimeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Left Scene Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnitLeftSceneTimeImpl extends ObservationImpl implements UnitLeftSceneTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitLeftSceneTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_LEFT_SCENE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLeftSceneTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLeftSceneTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLeftSceneTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLeftSceneTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLeftSceneTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLeftSceneTime init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UnitLeftSceneTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // UnitLeftSceneTimeImpl

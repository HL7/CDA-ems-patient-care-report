/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DestinationWardOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination Ward</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DestinationWardImpl extends ObservationImpl implements DestinationWard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationWardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DESTINATION_WARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationWardValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationWardOperations.validateDestinationWardValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationWard init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DestinationWard init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // DestinationWardImpl
